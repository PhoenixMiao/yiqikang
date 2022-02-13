package com.phoenix.yiqikang.service.Impl;

import com.phoenix.yiqikang.common.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.phoenix.yiqikang.dto.BriefLecture;
import com.phoenix.yiqikang.entity.Lecture;
import com.phoenix.yiqikang.mapper.LectureMapper;
import com.phoenix.yiqikang.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureServiceImpl implements LectureService {

    @Autowired
    private LectureMapper lectureMapper;
    @Override
    public Page<BriefLecture> getBriefLectureList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<BriefLecture> lectureList = lectureMapper.getBriefLecture();
        return new Page<>(new PageInfo<>(lectureList));
    }

    @Override
    public Page<BriefLecture> getLectureByStatus(int pageNum, int pageSize,int status) {
        PageHelper.startPage(pageNum, pageSize);
        List<BriefLecture> briefLectureList = lectureMapper.getNotStartLecture(status);
        return new Page<>(new PageInfo<>(briefLectureList));
    }


    @Override
    public Lecture getLectureDetail(Long id) {
        return lectureMapper.getLectureDetailById(id);
    }


}
