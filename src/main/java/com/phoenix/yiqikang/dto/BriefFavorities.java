package com.phoenix.yiqikang.dto;

import com.phoenix.yiqikang.entity.CourseFavorities;
import io.swagger.annotations.ApiModelProperty;

public class BriefFavorities {
    /**
     * {@link com.phoenix.yiqikang.entity.Lesson}
     */
    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("一级路径")
    private String firstPath;

    @ApiModelProperty("二级路径")
    private String secondPath;

    @ApiModelProperty("三级路径")
    private String thirdPath;
}
