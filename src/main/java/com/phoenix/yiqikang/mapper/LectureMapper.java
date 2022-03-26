package com.phoenix.yiqikang.mapper;

import com.github.pagehelper.Page;
import com.phoenix.yiqikang.MyMapper;
import com.phoenix.yiqikang.dto.BriefLecture;
import com.phoenix.yiqikang.dto.BriefLesson;
import com.phoenix.yiqikang.entity.Lecture;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LectureMapper extends MyMapper<Lecture> {
    @Select("SELECT theme,start_time,lecturer,picture FROM lecture")
    Page<BriefLecture> getBriefLecture();

    @Select("SELECT theme,start_time,lecturer,picture FROM lecture WHERE status=#{status}")
    List<BriefLecture> getNotStartLecture(@Param("status")Integer status);

    @Select("SELECT theme,start_time,lecturer,picture FROM lecture WHERE status=#{status}")
    List<BriefLecture> getEndLecture(@Param("status")Integer status);

    @Select("SELECT * FROM lecture WHERE id=#{id}")
    Lecture getLectureDetailById(@Param("id")Long id);


}
