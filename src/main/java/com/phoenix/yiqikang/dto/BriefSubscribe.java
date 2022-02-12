package com.phoenix.yiqikang.dto;

import io.swagger.annotations.ApiModelProperty;

public class BriefSubscribe {
    /**
     * {@link com.phoenix.yiqikang.entity.Subscribe}
     */

    @ApiModelProperty("订阅状态 0:无效 1：有效")
    private Boolean status;

    @ApiModelProperty("订阅结束时间")
    private String endTime;
}
