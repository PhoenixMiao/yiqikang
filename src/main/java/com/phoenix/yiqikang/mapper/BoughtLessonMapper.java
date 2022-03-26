package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.entity.BoughtLesson;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BoughtLessonMapper {
    @Insert("INSERT INTO bought_lesson(user_id,lesson_id) VALUES (#{user_id},#{lesson_id});")
    Long addBoughtLesson(@Param("user_id")Long userId, @Param("lesson_id")Long lessonId);

    @Select("SELECT * FROM bought_lesson WHERE user_id=#{user_id}")
    List<BoughtLesson> getUserBoughtLessonId(@Param("userId")Long userId);

}
