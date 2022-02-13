package com.phoenix.yiqikang.dto;

import com.phoenix.yiqikang.entity.CourseFavorities;
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
@ApiModel("BriefFavorities 收藏列表")
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
