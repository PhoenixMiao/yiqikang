package com.phoenix.yiqikang.dto;

import com.phoenix.yiqikang.entity.Lesson;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("EstimateType 评测分类")
public class EstimateType {
    @ApiModelProperty("分类名称")
    private String name;

    @ApiModelProperty("分数")
    private int scores;

    @ApiModelProperty("建议")
    private String suggestions;

    @ApiModelProperty("推荐课程")
    private List<BriefLesson> lessonList;
}
