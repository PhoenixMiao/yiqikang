package com.phoenix.yiqikang.controller.response;

import com.phoenix.yiqikang.dto.EstimateType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("EstimateResponse 评估返回")
public class EstimateResponse {

    @ApiModelProperty("评估记录id")
    private Long estimateId;

    @ApiModelProperty("评估类型列表")
    private List<EstimateType> estimateTypeList;
}
