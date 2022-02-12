package com.phoenix.yiqikang.controller;

import com.phoenix.yiqikang.annotation.Auth;
import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.common.Result;
import com.phoenix.yiqikang.dto.BriefLecture;
import com.phoenix.yiqikang.service.LectureService;
import com.phoenix.yiqikang.util.SessionUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@Api("讲座相关接口")
@RequestMapping("/lecture")
@Validated
public class LectureController {
    @Autowired
    private LectureService lectureService;

    @Autowired
    private SessionUtils sessionUtils;

    @Auth
    @GetMapping("/all")
    @ApiOperation("查看所有讲座")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageSize",value = "每页显示数量 (不小于0)",required = true,paramType = "query",dataType = "Integer"),
            @ApiImplicitParam(name = "pageNum", value = "页数 (不小于0)", required = true, paramType = "query", dataType = "Integer")})
    public Page<BriefLecture> getAllLessons(@NotNull @RequestParam("pageNum")Integer pageNum,
                                            @NotNull @RequestParam("pageSize")Integer pageSize){
        return lectureService.getBriefLectureList(pageNum,pageSize);
    }

    @GetMapping("/list")
    @ApiOperation("根据讲座状态分类获取讲座列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageSize",value = "每页显示数量 (不小于0)",required = true,paramType = "query",dataType = "Integer"),
            @ApiImplicitParam(name = "pageNum", value = "页数 (不小于0)", required = true, paramType = "query", dataType = "Integer"),
            @ApiImplicitParam(name = "status",value = "要查询的讲座当前状态 0未开始 1已结束",required = true,paramType = "query",dataType = "Integer")})
    public Result getBriefLecureListByStatus(@NotNull @RequestParam("pageSize")Integer pageSize,
                                                 @NotNull @RequestParam("pageNum")Integer pageNum,
                                                 @NotNull @RequestParam("status")Integer status){
        return Result.success(lectureService.getLectureByStatus(pageNum,pageSize,status));
    }



    @GetMapping("/detail")
    @ApiOperation("根据讲座Id获取讲座详情")
    @ApiImplicitParam(name = "id", value = "讲座id", required = true, paramType = "query", dataType = "Long")
    public Result detail(@NotNull@RequestParam("id")Long id) {
        return Result.success("获取成功", lectureService.getLectureDetail(id));
    }

}
