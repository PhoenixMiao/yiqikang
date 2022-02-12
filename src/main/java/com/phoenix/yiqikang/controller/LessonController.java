package com.phoenix.yiqikang.controller;

import com.phoenix.yiqikang.annotation.Auth;
import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.common.Result;
import com.phoenix.yiqikang.dto.BriefLesson;
import com.phoenix.yiqikang.entity.RecommendLesson;
import com.phoenix.yiqikang.service.LessonService;
import com.phoenix.yiqikang.util.SessionUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;


@RestController
@Api("课程相关接口")
@RequestMapping("/lesson")
@Validated
public class LessonController {
    @Autowired
    private LessonService lessonService;

    @Autowired
    private SessionUtils sessionUtils;

    @Auth
    @GetMapping("/all")
    @ApiOperation("查看所有课程")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageSize",value = "每页显示数量 (不小于0)",required = true,paramType = "query",dataType = "Integer"),
            @ApiImplicitParam(name = "pageNum", value = "页数 (不小于0)", required = true, paramType = "query", dataType = "Integer")})
    public Page<BriefLesson> getAllLesson(@NotNull @RequestParam("pageSize")Integer pageSize,
                                           @NotNull @RequestParam("pageNum")Integer pageNum){
        return lessonService.getBriefLessonPage(pageSize,pageNum);
    }

    //todo-Alba
    //记录表和记录曲线
    @GetMapping("/detail")
    @ApiOperation("根据课程Id获取课程详情")
    @ApiImplicitParam(name = "id", value = "课程id", required = true, paramType = "query", dataType = "Long")
    public Result detail(@NotNull@RequestParam("id")Long id) {
        return Result.success("获取成功", lessonService.getLessonDetail(id));
    }

    //todo-Alba
    @Auth
    @GetMapping("/recommend")
    @ApiOperation("查看推荐课程")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageSize",value = "每页显示数量 (不小于0)",required = true,paramType = "query",dataType = "Integer"),
            @ApiImplicitParam(name = "pageNum", value = "页数 (不小于0)", required = true, paramType = "query", dataType = "Integer")})
    public Page<RecommendLesson> getRecommendLessons(@NotNull @RequestParam("pageSize")Integer pageSize,
                                                     @NotNull @RequestParam("pageNum")Integer pageNum){
        return null;
    }


    @Auth
    @GetMapping("/search")
    @ApiOperation("根据课程名称关键字进行模糊搜索")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageSize",value = "每页显示数量 (不小于0)",required = true,paramType = "query",dataType = "Integer"),
            @ApiImplicitParam(name = "pageNum", value = "页数 (不小于0)", required = true, paramType = "query", dataType = "Integer"),
            @ApiImplicitParam(name = "content",value = "搜索框里输入的内容",required = true,paramType = "query",dataType = "String")})
    public Result searchLesson(@NotNull @RequestParam("pageSize")Integer pageSize,
                                  @NotNull @RequestParam("pageNum")Integer pageNum,
                                  @RequestParam("content") Integer id) {
        return null;
//        BriefLesson principal = (BriefLesson) SecurityUtils.getSubject().getPrincipal();
//        String username = principal.getUsername();
//        return Result.success("搜索成功！",userOrderService.searchUserOrder(pageNum,pageSize,id,username,sendOrReceive));
    //todo-Alba
        //j2ee搬过来的，首页对课程名称进行模糊搜索
    }


}
