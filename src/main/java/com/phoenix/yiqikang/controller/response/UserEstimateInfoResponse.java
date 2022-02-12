package com.phoenix.yiqikang.controller.response;

import cn.hutool.core.date.DateTime;
import io.swagger.annotations.ApiModelProperty;

public class UserEstimateInfoResponse {
    /**
     * {@link com.phoenix.yiqikang.entity.Estimate}
     */

    @ApiModelProperty("时间")
    private DateTime time;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("回答情况")
    private String answer;
    //二进制流保存 从左至右
}
