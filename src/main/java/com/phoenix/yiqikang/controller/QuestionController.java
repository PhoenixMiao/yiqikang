package com.phoenix.yiqikang.controller;


import com.phoenix.yiqikang.annotation.Auth;
import com.phoenix.yiqikang.entity.Question;
import com.phoenix.yiqikang.service.QuestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@Api("成长记录表相关操作")
@RestController
@RequestMapping("/question")
@Validated
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Auth
    @GetMapping("")
    @ApiOperation(value = "根据课程id获得成长记录表中所有问题", response = Question.class)
    @ApiImplicitParam(name = "lectureId", value = "课程id", required = true, paramType = "query", dataType = "Long")
    public Object getQuestionListByLectureId(@NotNull@RequestParam("lectureId")Long lectureId){
        return questionService.getQuestionListByLectureId(lectureId);
    }
}
