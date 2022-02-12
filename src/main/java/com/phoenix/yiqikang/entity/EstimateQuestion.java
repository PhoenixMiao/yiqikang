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
@ApiModel("EstimateQuestion评估问题")
public class EstimateQuestion {
    @Id
    @ApiModelProperty("问题id/顺序")
    private Long questionId;

    @ApiModelProperty("一级路径")
    private String firstPath;

    @ApiModelProperty("二级路径")
    private String secondPath;

    @ApiModelProperty("目标/题面")
    private String target;

    @ApiModelProperty("解决方案")
    private String resolution;

    @ApiModelProperty("课程id")
    private Long lessonId;

}
