
package com.phoenix.yiqikang.entity;

import cn.hutool.core.date.DateTime;
import com.fasterxml.jackson.core.SerializableString;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.saxon.functions.Serialize;

import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("订阅")
public class Subscribe {
    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("订阅状态 0:无效 1：有效")
    private Boolean status;

    @ApiModelProperty("订阅开始时间")
    private String startTime;

    @ApiModelProperty("订阅结束时间")
    private String endTime;
}



