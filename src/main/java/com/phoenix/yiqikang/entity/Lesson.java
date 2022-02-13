package com.phoenix.yiqikang.entity;

import com.fasterxml.jackson.core.SerializableString;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.saxon.functions.Serialize;

import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("Lesson课程")
public class Lesson {
    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("主路径")
    private String firstPath;

    @ApiModelProperty("二级路径")
    private String secondPath;

    @ApiModelProperty("三级路径")
    private String thirdPath;

    @ApiModelProperty("价格")
    private Double price;

    @ApiModelProperty("视频")
    private String video;

    @ApiModelProperty("ppt")
    private String ppt;
}
