package com.phoenix.yiqikang.controller;

import com.phoenix.yiqikang.annotation.Auth;
import com.phoenix.yiqikang.common.Result;
import io.swagger.annotations.ApiImplicitParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class GrowRecordController {

    @Auth
    @GetMapping("/all")
    @ApiImplicitParam(name = "name",value = "根据课程名称返回该课程对应问题",required = true,paramType = "query",dataType = "String")
    public Result getGrowRecordQuestionByLessonName(@Param("name")String name){
        return null;
        //todo-Alba
    }

    @Auth
    @PostMapping("/submit")
    public Result submitOwnAnswer(){
        return null;
        //todo-Alba
        //提交成长记录结果,更新推荐课程，返回笼统建议，三个类别的分数
    }







}
