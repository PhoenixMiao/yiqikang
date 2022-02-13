package com.phoenix.yiqikang.controller;

import com.phoenix.yiqikang.annotation.Auth;
import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.dto.BriefFavorities;
import com.phoenix.yiqikang.service.FavoritiesService;
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
@Api("收藏课程相关接口")
@RequestMapping("/favorities")
@Validated
public class FavoritiesController {

    @Autowired
    private SessionUtils sessionUtils;

    @Autowired
    private FavoritiesService favoritiesService;

    @Auth
    @GetMapping("/all")
    @ApiOperation(value= "根据id获取收藏的列表",response = BriefFavorities.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="PageSize",value="每页显示数量 (不小于0)",required = true,paramType = "query",dataType = "Integer"),
            @ApiImplicitParam(name="PageNum",value="页数（不小于0）",required = true,paramType = "query",dataType = "Integer")})
    public Page<BriefFavorities> getFavoritiesById(@NotNull @RequestParam("pageSize")Integer pageSize,
                                                   @NotNull @RequestParam("pageNum")Integer pageNum)
    {
        return favoritiesService.getUserFavoritiesId(pageSize,pageNum,sessionUtils.getUserId());
    }



    @Auth
    @PostMapping("/add")
    @ApiOperation(value = "添加收藏",response = Long.class)
    @ApiImplicitParam(name = "courseId",value = "课程id",required = true,paramType= "query")
    public Long addFavorities(@NotNull @RequestParam("courseId") Long courseId){
        return favoritiesService.addFavorities(sessionUtils.getUserId(),courseId);
    }

    @Auth
    @PostMapping("/delete")
    @ApiOperation(value = "删除收藏",response = Long.class)
    @ApiImplicitParam(name = "courseId",value = "课程id",required = true,paramType= "query")
    public Long deleteFavorities(@NotNull @RequestParam("courseId") Long courseId){
        return favoritiesService.deleteFavorities(sessionUtils.getUserId(),courseId);
    }




}

