package com.phoenix.yiqikang.service;

import com.phoenix.yiqikang.dto.SessionData;

public interface UserService {

    /**
     * 登录
     * @param code
     * @return
     */
    SessionData login(String code);
}
