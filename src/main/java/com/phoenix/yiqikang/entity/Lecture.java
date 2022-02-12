package com.phoenix.yiqikang.entity;


import cn.hutool.core.date.DateTime;
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
@ApiModel("Lecture 讲座")
public class Lecture implements Serializable{

    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("讲座主题")
    private String theme;

    @ApiModelProperty("开始时间")
    private String startTime;

    @ApiModelProperty("结束时间")
    private String endTime;

    @ApiModelProperty("主讲人")
    private String lecturer;

    @ApiModelProperty("直播链接")
    private String liveLink;

    @ApiModelProperty("录播视频")
    private String vedio;

    @ApiModelProperty("直播价格")
    private Double livePrice;

    @ApiModelProperty("录播价格")
    private Double vedioPrice;

    @ApiModelProperty("封面")
    private String picture;

    @ApiModelProperty("状态 1：未开始 0：已结束")
    private Integer status;

}
