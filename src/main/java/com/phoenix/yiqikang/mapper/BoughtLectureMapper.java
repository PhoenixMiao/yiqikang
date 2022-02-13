package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.dto.BriefLecture;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BoughtLectureMapper {
    @Insert("INSERT INTO boughtLecture(userId,lectureId) VALUES (#{userId},#{lectureId});")
    Long addBoughtLecture(@Param("userId")Long userId, @Param("lectureId")Long lectureId);

    @Select("SELECT lectureId FROM boughtLecture WHERE userId=#{userId}")
    BriefLecture getUserBoughtLectureId(@Param("userId")Long userId);

}
