package com.phoenix.yiqikang.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.dto.BriefLecture;
import com.phoenix.yiqikang.dto.BriefLesson;
import com.phoenix.yiqikang.mapper.BoughtLessonMapper;
import com.phoenix.yiqikang.service.BoughtLessonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoughtLessonServiceImpl implements BoughtLessonService {
    @Autowired
    private BoughtLessonMapper boughtLessonMapper;

    @Override
    public Long addBoughtLesson(Long userId,Long lessonId) {
        return boughtLessonMapper.addBoughtLesson(userId,lessonId);
    }
//
//    @Override
//    public Page<BriefLesson> getBoughtLesson(int pageNum, int pageSize, Long userId) {
//        PageHelper.startPage(pageNum, pageSize);
//        long briefLessonList = boughtLessonMapper.getUserBoughtLessonId(userId);
//        //return new Page<BriefLesson>(new PageInfo<BriefLesson>((List<BriefLesson>) briefLessonList));
////todo-Alba
////列表真的处理不好
    }

