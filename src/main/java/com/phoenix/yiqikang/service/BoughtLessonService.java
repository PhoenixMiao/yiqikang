package com.phoenix.yiqikang.service;

import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.dto.BriefLecture;
import com.phoenix.yiqikang.dto.BriefLesson;

public interface BoughtLessonService {
    Long addBoughtLesson(Long userId,Long lessonId);

    Page<BriefLesson> getBoughtLesson(int pageNum, int pageSize, Long userId);
}
