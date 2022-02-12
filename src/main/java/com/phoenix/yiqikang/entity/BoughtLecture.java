
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
@ApiModel("BoughtLecture 用户购买直播课程")
public class BoughtLecture implements Serializable {
    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("讲座id")
    private Long lectureId;

    @ApiModelProperty("用户Id")
    private Long userId;

    @ApiModelProperty("是否购买直播播")
    private Boolean isLive;

    @ApiModelProperty("是否购买录播")
    private Boolean isVedio;
}