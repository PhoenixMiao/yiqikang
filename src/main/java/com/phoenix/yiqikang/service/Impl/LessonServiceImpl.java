package com.phoenix.yiqikang.service.Impl;

import com.phoenix.yiqikang.common.CommonErrorCode;
import com.phoenix.yiqikang.common.CommonException;
import com.phoenix.yiqikang.common.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.phoenix.yiqikang.dto.BriefLesson;
import com.phoenix.yiqikang.entity.Lesson;
import com.phoenix.yiqikang.entity.RecommendLesson;
import com.phoenix.yiqikang.mapper.LessonMapper;
import com.phoenix.yiqikang.mapper.RecommendLessonMapper;
import com.phoenix.yiqikang.service.LessonService;
import com.phoenix.yiqikang.util.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {
    @Autowired
    private LessonMapper lessonMapper;

    @Autowired
    private SessionUtils sessionUtils;


    @Override
    public BriefLesson getBriefLessonById(Long id){
        return lessonMapper.getLessonById(id);
    }

    @Override
    public Page<BriefLesson> searchLesson(int pageNum, int pageSize, String content) {
        return null;
        //todo-Alba
    }

    @Override
    public Lesson getLessonDetail(Long id) {
        return lessonMapper.getLessonDetail(id);
    }

    @Override
    public Page<BriefLesson> getBriefLessonPage(int pageSize,int pageNum){
        PageHelper.startPage(pageNum,pageSize);
        List<BriefLesson> briefLessonList = lessonMapper.getBriefLesson();
        return new Page<>(new PageInfo<>(briefLessonList));

    }



}
