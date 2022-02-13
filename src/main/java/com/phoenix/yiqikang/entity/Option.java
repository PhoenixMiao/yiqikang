package com.phoenix.yiqikang.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("Option 选项")
public class Option {
    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("课程id")
    private Long lessonId;

    @ApiModelProperty("问卷id")
    private Long questionairdId;

    @ApiModelProperty("问题id")
    private Long questionId;

    @ApiModelProperty("选项1")
    private String v1;

    @ApiModelProperty("选项2")
    private String v2;

    @ApiModelProperty("选项3")
    private String v3;

    @ApiModelProperty("选项4")
    private String v4;

    @ApiModelProperty("分值1")
    private Integer num1;

    @ApiModelProperty("分值2")
    private Integer num2;

    @ApiModelProperty("分值3")
    private Integer num3;

    @ApiModelProperty("分值4")
    private Integer num4;

}
