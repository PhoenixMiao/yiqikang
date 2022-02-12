package com.phoenix.yiqikang.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BoughtLessonMapper {
    @Insert("INSERT INTO boughtLesson(userId,lessonId) VALUES (#{userId},#{lessonId});")
    Long addBoughtLesson(@Param("userId")Long userId, @Param("lessonId")Long lessonId);

    @Select("SELECT lessonId FROM boughtLesson WHERE userId=#{userId}")
    Long getUserBoughtLessonId(@Param("userId")Long userId);

}
