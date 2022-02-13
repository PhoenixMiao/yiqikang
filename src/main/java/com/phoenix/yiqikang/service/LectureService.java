package com.phoenix.yiqikang.service;

import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.dto.BriefLecture;
import com.phoenix.yiqikang.entity.Lecture;

public interface LectureService {
        Page<BriefLecture> getBriefLectureList(int pageNum, int pageSize);

        Page<BriefLecture> getLectureByStatus(int pageNum,int pageSize,int status);

        Lecture getLectureDetail(Long lectureId);
}
