package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.MyMapper;
import com.phoenix.yiqikang.dto.BriefLesson;
import com.phoenix.yiqikang.entity.RecommendLesson;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RecommendLessonMapper extends MyMapper<RecommendLesson> {

    @Select("SELECT lessonId from RecommendLesson WHERE user_id = #{user_id} AND version=#{version}")
    List<Long> getNewestRecommend(@Param("user_id")Long userId, @Param("version")Integer version);

}
