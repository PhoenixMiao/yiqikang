package com.phoenix.yiqikang.dto;

import com.phoenix.yiqikang.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("BriefLesson 全部课程列表")
public class BriefLesson implements Serializable {

    /**
     * {@link com.phoenix.yiqikang.entity.Lesson}
     */

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("一级路径")
    private String firstPath;

    @ApiModelProperty("二级路径")
    private String secondPath;

    @ApiModelProperty("三级路径")
    private String thirdPath;
}
