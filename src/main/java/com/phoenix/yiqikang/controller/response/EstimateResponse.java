package com.phoenix.yiqikang.controller.response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;

public class EstimateResponse {
    @Id
    @ApiModelProperty("问题id/顺序")
    private Long questionId;

    @ApiModelProperty("目标")
    private String target;
}
