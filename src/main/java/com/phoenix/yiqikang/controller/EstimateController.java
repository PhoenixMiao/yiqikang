package com.phoenix.yiqikang.controller;

import com.phoenix.yiqikang.annotation.Auth;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@Api("评估问题相关接口")
@RequestMapping("/analysis")
@Validated
public class EstimateController {

//    @Auth
//    @GetMapping("/question")
//    @ApiOperation(value = "返回评估问题列表estimateQuestion",response = Long.class)
//    @ApiImplicitParam(name = "lectureId",value = "id",required = true,paramType= "query")
//    public Long getBoughtLecture(@NotNull @RequestParam("lectureId") Long lectureId){
//        return boughtLectureService.addBoughtLecture(sessionUtils.getUserId(),lectureId);
//    }

//    @Auth
//    @PostMapping("/add")
//    @ApiOperation(value = "新增评估",response = .class)
//    @ApiImplicitParam(name = "",value = "",required = true,paramType= "query")
//    public Long getBoughtLecture(){
//        return null;
//    }
//
//    @Auth
//    @GetMapping("/all")
//    @ApiOperation(value = "返回历史评估列表",response = Long.class)
//    @ApiImplicitParam(name = "lectureId",value = "id",required = true,paramType= "query")
//    public Long getBoughtLecture(@NotNull @RequestParam("lectureId") Long lectureId){
//        return boughtLectureService.addBoughtLecture(sessionUtils.getUserId(),lectureId);
//    }
////
//    @Auth
//    @GetMapping("/detail")
//    @ApiOperation(value = "返回某次评估详情",response = Long.class)
//    @ApiImplicitParam(name = "lectureId",value = "id",required = true,paramType= "query")
//    public Long getBoughtLecture(@NotNull @RequestParam("lectureId") Long lectureId){
//        return boughtLectureService.addBoughtLecture(sessionUtils.getUserId(),lectureId);
//    }
//
//    @Auth
//    @GetMapping("/watch")
//    @ApiOperation(value = "返回可视化数据",response = Long.class)
//    @ApiImplicitParam(name = "lectureId",value = "id",required = true,paramType= "query")
//    public Long getBoughtLecture(@NotNull @RequestParam("lectureId") Long lectureId){
//        return boughtLectureService.addBoughtLecture(sessionUtils.getUserId(),lectureId);
//    }
//    //历史评估的三个维度的分数


}
