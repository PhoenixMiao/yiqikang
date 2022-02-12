package com.phoenix.yiqikang.controller.response;

import io.swagger.annotations.ApiModelProperty;

public class UserResponse {
    /**
     * {@link com.phoenix.yiqikang.entity.User}
     */

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("联系方式")
    private String telephone;

    @ApiModelProperty("电子邮件")
    private String email;

    @ApiModelProperty("头像")
    private String profile;
}
