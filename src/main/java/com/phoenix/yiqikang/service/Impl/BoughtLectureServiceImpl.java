package com.phoenix.yiqikang.service.Impl;

import com.phoenix.yiqikang.common.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.phoenix.yiqikang.dto.BriefLecture;
import com.phoenix.yiqikang.mapper.BoughtLectureMapper;
import com.phoenix.yiqikang.service.BoughtLectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoughtLectureServiceImpl implements BoughtLectureService {

    @Autowired
    private BoughtLectureMapper boughtLectureMapper;

    @Override
    public Long addBoughtLecture(Long userId,Long lectureId) {
        return boughtLectureMapper.addBoughtLecture(userId,lectureId);
    }

    @Override
    public Page<BriefLecture> getBoughtLecture(int pageNum, int pageSize, Long userId) {
        PageHelper.startPage(pageNum, pageSize);
        BriefLecture briefLecturePage = boughtLectureMapper.getUserBoughtLectureId(userId);
        return new Page<>(new PageInfo<>((List<BriefLecture>) briefLecturePage));
    }


}
