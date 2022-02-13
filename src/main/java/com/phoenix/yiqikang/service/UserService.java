package com.phoenix.yiqikang.service;

import com.phoenix.yiqikang.controller.request.UpdateUserByIdRequest;
import com.phoenix.yiqikang.controller.response.UserResponse;
import com.phoenix.yiqikang.dto.SessionData;
import org.apache.ibatis.annotations.Update;

public interface UserService {

    /**
     * 登录
     * @param code
     * @return
     */
    SessionData login(String code);

    UserResponse getUserById(Long id);

    void updateUserById(UpdateUserByIdRequest updateUserByIdRequest, Long id);
    //void updateUserById(UpdateUserByIdRequest updateUserByIdRequest,Long id);
}
