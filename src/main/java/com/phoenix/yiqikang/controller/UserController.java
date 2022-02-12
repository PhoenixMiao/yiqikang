package com.phoenix.yiqikang.controller;

import com.phoenix.yiqikang.annotation.Auth;
import com.phoenix.yiqikang.controller.request.UpdateUserByIdRequest;
import com.phoenix.yiqikang.controller.response.UserResponse;
import com.phoenix.yiqikang.dto.SessionData;
import com.phoenix.yiqikang.service.UserService;
import com.phoenix.yiqikang.util.SessionUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SessionUtils sessionUtils;

    @GetMapping("/login/{code}")
    @ApiOperation(value = "登录",response = SessionData.class)
    @ApiImplicitParam(name = "code", value = "code", required = true, paramType = "path")
    public Object login(@NotBlank @PathVariable("code") String code){

        return userService.login(code);

    }


    @Auth
    @GetMapping("/info")
    @ApiOperation(value = "查看当前用户信息",response = UserResponse.class)
    public Object getUserByIdResponse(){
        Long id = sessionUtils.getUserId();
        UserResponse userResponse = userService.getUserById(id);
        return userResponse;
    }

    @Auth
    @PostMapping("/update")
    @ApiOperation(value = "更新当前用户信息",response = String.class)
    public Object updateUserById(@NotNull @Valid @RequestBody UpdateUserByIdRequest updateUserByIdRequest){
        Long id = sessionUtils.getUserId();
        userService.updateUserById(updateUserByIdRequest,id);
        return "操作成功";
    }
}
