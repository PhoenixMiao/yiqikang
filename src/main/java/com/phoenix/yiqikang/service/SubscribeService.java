package com.phoenix.yiqikang.service;

import com.phoenix.yiqikang.dto.BriefSubscribe;
import com.phoenix.yiqikang.util.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;

public interface SubscribeService {

    void addSubscribe(Long userId,Boolean status,String startTime,Integer time);
    //订阅以月为单位
    void updateSubscribe(Long userId,Integer time);

    BriefSubscribe getSubscribeByUserId(Long userId);


}
