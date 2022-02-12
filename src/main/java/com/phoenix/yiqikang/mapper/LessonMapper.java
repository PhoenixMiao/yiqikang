package com.phoenix.yiqikang.mapper;

import com.github.pagehelper.Page;
import com.phoenix.yiqikang.MyMapper;
import com.phoenix.yiqikang.controller.response.UserResponse;
import com.phoenix.yiqikang.dto.BriefFavorities;
import com.phoenix.yiqikang.dto.BriefLesson;
import com.phoenix.yiqikang.entity.Lesson;
import com.phoenix.yiqikang.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LessonMapper extends MyMapper<Lesson> {

    @Select("SELECT firstPath,secondPath,thirdPath,name FROM lesson")
    Page<BriefLesson> getBriefLesson();

    @Select("SELECT firstPath,secondPath,thirdPath,name FROM lesson WHERE id=#{id}")
    BriefLesson getLessonById(@Param("id")Long id);
    //提供给其他"课程收藏"、"已购课程"使用的接口

    @Select("SELECT name,firstPath,secondPath,ThirdPath FROM lesson WHERE content LIKE CONCAT('%',#{firstPath,jdbcType=VARCHAR},'%') OR CONCAT('%',#{secondPath,jdbcType=VARCHAR},'%') OR CONCAT('%',#{thirdPath,jdbcType=VARCHAR},'%') OR CONCAT('%',#{name,jdbcType=VARCHAR},'%')")
    List<BriefLesson> searchLesson(@Param("content")String content);
    //todo-Alba 首页模糊搜索

    @Select("SELECT * FROM lesson WHERE id=#{id}")
    Lesson getLessonDetail(@Param("id")Long id);


}
