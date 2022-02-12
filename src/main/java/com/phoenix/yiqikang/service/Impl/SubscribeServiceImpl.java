package com.phoenix.yiqikang.service.Impl;

import com.phoenix.yiqikang.dto.BriefSubscribe;
import com.phoenix.yiqikang.mapper.SubscribeMapper;
import com.phoenix.yiqikang.service.SubscribeService;
import com.phoenix.yiqikang.util.DatesUtil;
import com.phoenix.yiqikang.util.SessionUtils;
import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;

public class SubscribeServiceImpl implements SubscribeService {

    @Autowired
    private SessionUtils sessionUtils;

    @Autowired
    private SubscribeMapper subscribeMapper;

    @Override
    public void addSubscribe(Long userId, Boolean status, String startTime, Integer time) {
        //todo-Alba
//        Long endTime = new Long(startTime) + time*30*24*60*60;
//        subscribeMapper.insertSubscribe(userId,1, Time.now(),String(endTime));
    }

    @Override
    public void updateSubscribe(Long userId, Integer time) {
        //todo-Alba
//        Long endTime = new Long(Time.now()) + time*30*24*60*60;
//        subscribeMapper.insertSubscribe(userId,1, Time.now(),String(endTime));
    }

    @Override
    public BriefSubscribe getSubscribeByUserId(Long userId) {
        return subscribeMapper.getBriefSubscribe(userId);
    }
}
