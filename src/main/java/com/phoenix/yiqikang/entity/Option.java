package com.phoenix.yiqikang.entity;

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
@ApiModel("选项")
public class Option {
    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("课程id")
    private Long lectureId;

    @ApiModelProperty("问卷id")
    private Long questionaireId;

    @ApiModelProperty("问题id")
    private Long questionId;

    @ApiModelProperty("选项1")
    private String v1;

    @ApiModelProperty("分值1")
    private Integer num1;

    @ApiModelProperty("选项2")
    private String v2;

    @ApiModelProperty("分值2")
    private Integer num2;

    @ApiModelProperty("选项3")
    private String v3;

    @ApiModelProperty("分值3")
    private Integer num3;

    @ApiModelProperty("选项4")
    private String v4;

    @ApiModelProperty("分值4")
    private Integer num4;
}
