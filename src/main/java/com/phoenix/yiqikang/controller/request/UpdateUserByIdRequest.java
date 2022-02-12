package com.phoenix.yiqikang.controller.request;

import com.phoenix.yiqikang.entity.User;
import io.swagger.annotations.ApiModelProperty;

public class UpdateUserByIdRequest {

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("联系方式")
    private String telephone;

    @ApiModelProperty("电子邮件")
    private String email;

    @ApiModelProperty("头像")
    private String portrait;

    public Object getUsername() {
        return username;
    }

    public Object getTelePhone() {
        return telephone;
    }

    public Object getPortrait() {
        return portrait;
    }

    public Object getEmail() {
        return email;
    }

}