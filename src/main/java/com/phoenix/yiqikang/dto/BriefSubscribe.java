package com.phoenix.yiqikang.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("BriefSubscribe 订阅列表")
public class BriefSubscribe {
    /**
     * {@link com.phoenix.yiqikang.entity.Subscribe}
     */

    @ApiModelProperty("订阅状态 0:无效 1：有效")
    private Boolean status;

    @ApiModelProperty("订阅结束时间")
    private String endTime;
}
