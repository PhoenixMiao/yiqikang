
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
@ApiModel("Comment评论")
public class Comment{
    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("课程id")
    private Long courseId;

    @ApiModelProperty("发布时间")
    private String time;

    @ApiModelProperty("评论人id")
    private Long senderId;

    @ApiModelProperty("接受回应id")
    private Long receiverId;

    @ApiModelProperty("是否为主评论")
    private Boolean directComment;

    @ApiModelProperty("主评论id")
    private Long directCommentId;

    @ApiModelProperty("评论内容")
    private String comment;




}
