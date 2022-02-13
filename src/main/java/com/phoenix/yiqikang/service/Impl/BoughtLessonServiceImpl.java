package com.phoenix.yiqikang.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.common.PageParam;
import com.phoenix.yiqikang.dto.BriefLecture;
import com.phoenix.yiqikang.dto.BriefLesson;
import com.phoenix.yiqikang.entity.BoughtLesson;
import com.phoenix.yiqikang.entity.Lesson;
import com.phoenix.yiqikang.mapper.BoughtLessonMapper;
import com.phoenix.yiqikang.mapper.LessonMapper;
import com.phoenix.yiqikang.service.BoughtLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class BoughtLessonServiceImpl implements BoughtLessonService {
    @Autowired
    private BoughtLessonMapper boughtLessonMapper;

    @Autowired
    private LessonMapper lessonMapper;

    @Override
    public Long addBoughtLesson(Long userId,Long lessonId) {
        return boughtLessonMapper.addBoughtLesson(userId,lessonId);
    }

    @Override
    public Page<BriefLesson> getBoughtLesson(int pageNum, int pageSize, Long userId) {
        PageHelper.startPage(pageNum,pageSize);
        List<BoughtLesson> boughtLessonList = boughtLessonMapper.getUserBoughtLessonId(userId);
        Page page = new Page<>(new PageInfo<>(boughtLessonList));
        ArrayList<BriefLesson> briefLessonArrayList = new ArrayList<>();
        for(BoughtLesson boughtLesson:boughtLessonList){
            briefLessonArrayList.add(lessonMapper.getLessonById(boughtLesson.getId()));
        }
        briefLessonArrayList.sort(new Comparator<BriefLesson>(){
            @Override
            public int compare(BriefLesson a,BriefLesson b) {
                return a.getFirstPath().compareTo(b.getFirstPath()); //这是顺序
            }
        });
        return new Page(new PageParam(pageSize,pageNum,""),page.getTotal(),page.getPages(),briefLessonArrayList);
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

