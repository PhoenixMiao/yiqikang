package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.MyMapper;
import com.phoenix.yiqikang.entity.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface QuestionMapper extends MyMapper<Question> {
    @Select("SELECT * FROM question WHERE lecture_id=#{lecture_id}")
    List<Question> getQuestionListByLectureId(@Param("lecture_id")Long lectureId);
}
