package com.phoenix.yiqikang.service.Impl;

import com.phoenix.yiqikang.entity.GrowRecord;
import com.phoenix.yiqikang.mapper.GrowRecordMapper;
import com.phoenix.yiqikang.service.GrowRecordService;
import com.phoenix.yiqikang.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrowRecordServiceImpl implements GrowRecordService {

    @Autowired
    private GrowRecordMapper growRecordMapper;

    @Override
    public Long submitQuestionnaire(Integer scores, Long lectureId, Long userId) {
        return (long)growRecordMapper.insert(
                GrowRecord.builder()
                        .scores(scores)
                        .lectureId(lectureId)
                        .userId(userId)
                        .time(TimeUtil.getCurrentTimestamp())
                        .build()
        );
    }

    @Override
    public List<GrowRecord> getGrowRecordList(Long userId, Long lectureId) {
        return growRecordMapper.getGrowRecordList(userId,lectureId);
    }
}
