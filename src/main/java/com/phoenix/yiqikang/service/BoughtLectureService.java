package com.phoenix.yiqikang.service;

import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.dto.BriefLecture;

public interface BoughtLectureService {
    Long addBoughtLecture(Long userId,Long lectureId);

    Page<BriefLecture> getBoughtLecture(int pageNum, int pageSize, Long userId);
}

