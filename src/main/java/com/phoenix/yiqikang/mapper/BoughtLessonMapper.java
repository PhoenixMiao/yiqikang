package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.entity.BoughtLesson;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BoughtLessonMapper {
    @Insert("INSERT INTO boughtLesson(userId,lessonId) VALUES (#{userId},#{lessonId});")
    Long addBoughtLesson(@Param("userId")Long userId, @Param("lessonId")Long lessonId);

    @Select("SELECT * FROM boughtLesson WHERE userId=#{userId}")
    List<BoughtLesson> getUserBoughtLessonId(@Param("userId")Long userId);

}
