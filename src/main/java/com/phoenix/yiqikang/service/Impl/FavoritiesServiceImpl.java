package com.phoenix.yiqikang.service.Impl;

import com.phoenix.yiqikang.common.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.phoenix.yiqikang.dto.BriefFavorities;
import com.phoenix.yiqikang.mapper.FavoritiesMapper;
import com.phoenix.yiqikang.mapper.LessonMapper;
import com.phoenix.yiqikang.service.FavoritiesService;
import com.phoenix.yiqikang.util.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritiesServiceImpl implements FavoritiesService {

    @Autowired
    private FavoritiesMapper favoritiesMapper;

    @Autowired
    private SessionUtils sessionUtils;

    @Autowired
    private LessonMapper lessonMapper;

    @Override
    public Long addFavorities(Long userId, Long courseId) {
        return favoritiesMapper.newFavorities(userId,courseId);
    }

    @Override
    public Long deleteFavorities(Long userId, Long courseId) {
        return favoritiesMapper.deleteFavorities(userId,courseId);
    }

    @Override
    public Page<BriefFavorities> getUserFavoritiesId(int pageNum, int pageSize, Long userId) {
        PageHelper.startPage(pageNum, pageSize);

        List<BriefFavorities> briefFavoritiesList= (List<BriefFavorities>) lessonMapper.getLessonById(favoritiesMapper.getUserFavoritiesId(userId));
        return new Page<>(new PageInfo<>(briefFavoritiesList));
    }


}
