package com.phoenix.yiqikang.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("User 用户")
public class User implements Serializable {
    @Id
    @ApiModelProperty("用户id")
    private Long id;

    @ApiModelProperty("会话id")
    private String sessionId;

    @ApiModelProperty("用户唯一标识")
    private String openId;

    @ApiModelProperty("unionid")
    private String unionId;

    @ApiModelProperty("会话密钥")
    private String sessionKey;

    @ApiModelProperty("创建时间")
    private String createTime;

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

    @ApiModelProperty("评估次数")
    private Integer estimateTimes;
}
