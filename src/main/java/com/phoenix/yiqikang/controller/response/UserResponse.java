package com.phoenix.yiqikang.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("UserResponse 用户个人信息")
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
