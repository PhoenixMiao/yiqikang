package com.phoenix.yiqikang.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;

public class RecommendLesson {
    @Id
    @ApiModelProperty
    private Long id;

    @ApiModelProperty
    private Long userId;

    @ApiModelProperty
    private Long lessonId;

    @ApiModelProperty
    private String generateTime;
}
