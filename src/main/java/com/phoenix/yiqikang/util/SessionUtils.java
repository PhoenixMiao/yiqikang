package com.phoenix.yiqikang.util;

import com.phoenix.yiqikang.common.CommonConstants;
import com.phoenix.yiqikang.dto.SessionData;
import com.phoenix.yiqikang.entity.User;
import com.phoenix.yiqikang.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;
import java.util.UUID;

/**
 * @author phoenix
 * @version 2022/1/19 19:21
 */
@Component
public class SessionUtils {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpServletResponse response;

    @Autowired
    private RedisUtils redisUtil;

    @Autowired
    private UserMapper userMapper;

    public Long getUserId(){
        return Optional
                .ofNullable(getSessionData())
                .orElse(new SessionData())
                .getId();
    }

    public SessionData getSessionData(){
        String key = request.getHeader(CommonConstants.SESSION);
        if(key == null)return null;

        SessionData sessionData;
        try {
            sessionData = (SessionData) redisUtil.get(key);
        }catch (Exception e){
            return getSessionDataFromDB(key);

        }
        if(sessionData != null)return sessionData;
        return getSessionDataFromDB(key);
    }

    public void setSessionId(String sessionId){
        response.setHeader(CommonConstants.SESSION,sessionId);
    }

    public String generateSessionId(){
        String sessionId = UUID.randomUUID().toString();
        response.setHeader(CommonConstants.SESSION,sessionId);
        return sessionId;
    }


    //todo
    public void invalidate(){
        request.removeAttribute(CommonConstants.SESSION);
    }

    private SessionData getSessionDataFromDB(String key) {
        SessionData sessionData;
        User user = userMapper.selectOne(User.builder().sessionId(key).build());
        if(user != null){
            sessionData = new SessionData(user);
            redisUtil.set(key,sessionData);
            return sessionData;
        }else{
            redisUtil.set(key,null,3600);
            return null;
        }
    }
}
