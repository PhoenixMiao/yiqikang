package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.dto.BriefLecture;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BoughtLectureMapper {
    @Insert("INSERT INTO bought_lecture(user_id,lecture_id) VALUES (#{user_id},#{lecture_id});")
    Long addBoughtLecture(@Param("user_id")Long userId, @Param("lecture_id")Long lectureId);

    @Select("SELECT lecture_id FROM bought_lecture WHERE user_id=#{user_id}")
    BriefLecture getUserBoughtLectureId(@Param("user_id")Long userId);

}
