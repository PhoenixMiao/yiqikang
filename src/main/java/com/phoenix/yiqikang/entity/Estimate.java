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
@ApiModel("Estimate评估记录")
public class Estimate{
    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("时间")
    private String time;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("回答情况")
    private String answer;
    //二进制流保存 从左至右
}
