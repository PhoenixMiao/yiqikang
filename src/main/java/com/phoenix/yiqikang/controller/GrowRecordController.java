package com.phoenix.yiqikang.controller;

import com.phoenix.yiqikang.annotation.Auth;
import com.phoenix.yiqikang.common.Result;
import com.phoenix.yiqikang.service.GrowRecordService;
import com.phoenix.yiqikang.util.SessionUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@Api("成长记录相关接口")
@RequestMapping("/growRecord")
@Validated
public class GrowRecordController {

    @Autowired
    private GrowRecordService growRecordService;

    @Autowired
    private SessionUtils sessionUtils;

    @Auth
    @PostMapping("/submit")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "scores",value = "总分数",required = true,paramType = "query"),
            @ApiImplicitParam(name = "lectureId",value = "课程id",required = true,paramType = "query")
    })
    public Object submitOwnAnswer(@NotNull @RequestParam("scores")Integer scores,
                                       @NotNull@RequestParam("lectureId")Long lectureId){
        return growRecordService.submitQuestionnaire(scores,lectureId,sessionUtils.getUserId());
    }


    @Auth
    @GetMapping("/list")
    @ApiImplicitParam(name = "lectureId",value = "课程id",required = true,paramType = "query")
    public Object getGrowRecordList(@NotNull @RequestParam("lectureId")Long lectureId){
        return growRecordService.getGrowRecordList(sessionUtils.getUserId(),lectureId);
    }



}
