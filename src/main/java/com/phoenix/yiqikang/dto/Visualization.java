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
@ApiModel("Visualization 可视化返回单例")
public class Visualization {
    @ApiModelProperty("分类")
    private String type;

    @ApiModelProperty("日期")
    private String time;

    @ApiModelProperty("分数")
    private Integer scores;
}
