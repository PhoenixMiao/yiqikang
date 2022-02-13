package com.phoenix.yiqikang.service;

import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.dto.BriefLesson;
import com.phoenix.yiqikang.entity.Lesson;

import java.util.List;

public interface LessonService {
    Page<BriefLesson> getBriefLessonPage(int PageSize,int PageNum);

    BriefLesson getBriefLessonById(Long id);

    Page<BriefLesson> searchLesson(int pageNum,int pageSize,String content);

    Lesson getLessonDetail(Long id);

    List<BriefLesson> getRecommend(Long userId);
}
