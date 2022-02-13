package com.phoenix.yiqikang.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("推荐课程")
public class RecommendLesson implements Serializable {
    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("评估记录id")
    private Long estimateId;

    @ApiModelProperty("课程id")
    private Long lectureId;

    @ApiModelProperty("版本")
    private Integer version;
}
