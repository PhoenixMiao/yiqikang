package com.phoenix.yiqikang.service;

import com.phoenix.yiqikang.entity.GrowRecord;

import java.util.List;

public interface GrowRecordService {
    Long submitQuestionnaire(Integer scores,Long lectureId,Long userId);

    List<GrowRecord> getGrowRecordList(Long userId,Long lectureId);
}
