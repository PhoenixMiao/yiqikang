package com.phoenix.yiqikang.controller;

import com.phoenix.yiqikang.annotation.Auth;
import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.controller.response.EstimateResponse;
import com.phoenix.yiqikang.dto.BriefFavorities;
import com.phoenix.yiqikang.dto.EstimateType;
import com.phoenix.yiqikang.entity.Estimate;
import com.phoenix.yiqikang.entity.EstimateQuestion;
import com.phoenix.yiqikang.service.EstimateService;
import com.phoenix.yiqikang.util.SessionUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@Api("评估问题相关接口")
@RequestMapping("/estimate")
@Validated
public class EstimateController {

    @Autowired
    private EstimateService estimateService;

    @Autowired
    private SessionUtils sessionUtils;

    @Auth
    @GetMapping("/question")
    @ApiOperation(value = "返回评估问题列表",response = EstimateQuestion.class)
    public Object getEstimateQuestionList(){
        return estimateService.getEstimateQuestionList();
    }


    @Auth
    @PostMapping("/submit")
    @ApiOperation(value = "提交评估",response = EstimateResponse.class)
    @ApiImplicitParam(name = "answer",value = "回答情况（二进制流1010101000,58位）",required = true,paramType= "query")
    public Object submit(@NotNull @RequestParam("answer")String answer){
        return estimateService.submitEstimate(sessionUtils.getUserId(),answer);
    }


    @Auth
    @GetMapping("/all")
    @ApiOperation(value= "历史评估列表",response = BriefFavorities.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="PageSize",value="每页显示数量 (不小于0)",required = true,paramType = "query",dataType = "Integer"),
            @ApiImplicitParam(name="PageNum",value="页数（不小于0）",required = true,paramType = "query",dataType = "Integer")})
    public Object getBoughtLecture(@NotNull @RequestParam("pageSize")Integer pageSize,
                                           @NotNull @RequestParam("pageNum")Integer pageNum){
        return estimateService.getEstimateList(pageNum,pageSize,sessionUtils.getUserId());
    }



    @Auth
    @GetMapping("/result")
    @ApiOperation(value = "返回某次评估详情",response = Long.class)
    @ApiImplicitParam(name = "estimateId",value = "评估id",required = true,paramType= "query")
    public Object getEstimateResult(@NotNull @RequestParam("estimateId") Long estimateId){
        return estimateService.getEstimateResult(estimateId);
    }


    @Auth
    @GetMapping("/watch")
    @ApiOperation(value = "返回可视化数据",response = Long.class)
    public Object visualize(){
        return estimateService.visualize(sessionUtils.getUserId());
    }


}
