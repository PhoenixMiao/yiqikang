package com.phoenix.yiqikang.dto;

import io.swagger.annotations.ApiModelProperty;

public class BriefLecture {
    /**
     * {@link com.phoenix.yiqikang.entity.Lecture}
     */

    @ApiModelProperty("讲座主题")
    private String theme;

    @ApiModelProperty("开始时间")
    private String startTime;

    @ApiModelProperty("主讲人")
    private String lecturer;

    @ApiModelProperty("封面")
    private String picture;
}
