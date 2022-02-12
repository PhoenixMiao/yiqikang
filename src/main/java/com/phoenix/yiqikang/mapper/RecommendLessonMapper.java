package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.MyMapper;
import com.phoenix.yiqikang.controller.response.UserResponse;
import com.phoenix.yiqikang.dto.BriefLesson;
import com.phoenix.yiqikang.entity.Lesson;
import com.phoenix.yiqikang.entity.RecommendLesson;
import com.phoenix.yiqikang.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RecommendLessonMapper extends MyMapper<RecommendLesson> {
    @Insert("INSERT INTO RecommendLesson(id,userId,lessonId,generateTime) VALUES (#{id},#{userId},#{lessonId},#{generateTime})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    Long newRecommendLesson(RecommendLesson recommendLesson);
    //新增推荐课程

    @Select("SELECT generateTime from RecommendLesson")
    String getTime();
    //获取推荐课程列表的生成时间

    @Select("SELECT id,name,firstPath,secondPath,thirdPath,price from RecommendLesson WHERE userId = #{userId} AND generateTime = #{generateTime}")
    List<BriefLesson> getNewestRecommendByUserIdAndTime(@Param("userId")Long userId, @Param("generateTime")String generateTime);
    //获取该用户最新的推荐课程列表

    //@Select("SELECT gengrateTime FROM RecommendLesson ORDER BY column_name DESC LIMIT 1;")
    //todo-Alba






}
