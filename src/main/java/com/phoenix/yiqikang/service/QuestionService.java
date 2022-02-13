package com.phoenix.yiqikang.service;

import com.phoenix.yiqikang.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getQuestionListByLectureId(Long lectureId);
}
