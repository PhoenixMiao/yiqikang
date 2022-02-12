package com.phoenix.yiqikang.controller;

import com.phoenix.yiqikang.annotation.Auth;
import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.dto.BriefFavorities;
import com.phoenix.yiqikang.dto.BriefLesson;
import com.phoenix.yiqikang.entity.Lecture;
import com.phoenix.yiqikang.entity.Lesson;
import com.phoenix.yiqikang.service.BoughtLectureService;
import com.phoenix.yiqikang.service.BoughtLessonService;
import com.phoenix.yiqikang.util.SessionUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@RestController
@Api("购买课程相关接口")
@RequestMapping("/boughtLesson")
@Validated
public class BoughtLessonController {
    @Autowired
    private BoughtLessonService boughtLessonService;

    @Autowired
    private SessionUtils sessionUtils;

    @Auth
    @PostMapping("/add")
    @ApiOperation(value = "用户购买课程",response = Long.class)
    @ApiImplicitParam(name = "lessonId",value = "id",required = true,paramType= "query")
    public Long getBoughtLesson(@NotNull @RequestParam("lessonId") Long lessonId){
        return boughtLessonService.addBoughtLesson(sessionUtils.getUserId(),lessonId);
    }

    @Auth
    @GetMapping("/all")
    @ApiOperation(value= "根据id获取购买课程的列表",response = BriefLesson.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="PageSize",value="每页显示数量 (不小于0)",required = true,paramType = "query",dataType = "Integer"),
            @ApiImplicitParam(name="PageNum",value="页数（不小于0）",required = true,paramType = "query",dataType = "Integer")})
    public Page getBoughtLectureById(@NotNull @RequestParam("pageSize")Integer pageSize,
                                     @NotNull @RequestParam("pageNum")Integer pageNum)
    {
        return boughtLessonService.getBoughtLesson(pageSize,pageNum,sessionUtils.getUserId());

    }

}

