
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
@ApiModel("GrowRecordQuestion成长记录问题")
public class GrowRecordQuestion implements Serializable{
    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("课程id")
    private Long lectureId;

    @ApiModelProperty("问题1")
    private Long k1;

    @ApiModelProperty("问题2")
    private Long k2;

    @ApiModelProperty("问题3")
    private Long k3;

    @ApiModelProperty("问题4")
    private Long k4;

    @ApiModelProperty("问题5")
    private Long k5;

    @ApiModelProperty("问题6")
    private Long k6;

    @ApiModelProperty("问题7")
    private Long k7;

    @ApiModelProperty("问题8")
    private Long k8;

    @ApiModelProperty("问题9")
    private Long k9;

    @ApiModelProperty("问题10")
    private Long k10;

    @ApiModelProperty("问题11")
    private Long k11;

    @ApiModelProperty("问题12")
    private Long k12;

    @ApiModelProperty("问题13")
    private Long k13;

    @ApiModelProperty("问题14")
    private Long k14;

    @ApiModelProperty("问题15")
    private Long k15;

    @ApiModelProperty("问题16")
    private Long k16;

    @ApiModelProperty("问题17")
    private Long k17;

    @ApiModelProperty("问题18")
    private Long k18;

    @ApiModelProperty("问题19")
    private Long k19;

    @ApiModelProperty("问题20")
    private Long k20;

}
