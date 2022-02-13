package com.phoenix.yiqikang.service.Impl;

import com.phoenix.yiqikang.entity.Question;
import com.phoenix.yiqikang.mapper.QuestionMapper;
import com.phoenix.yiqikang.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<Question> getQuestionListByLectureId(Long lectureId) {
        return questionMapper.getQuestionListByLectureId(lectureId);
    }


}
