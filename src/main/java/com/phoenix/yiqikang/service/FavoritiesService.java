package com.phoenix.yiqikang.service;

import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.dto.BriefFavorities;

public interface FavoritiesService {

    Long addFavorities(Long userId,Long courseId);

    Long deleteFavorities(Long userId, Long courseId);

    Page<BriefFavorities> getUserFavoritiesId(int pageNum, int pageSize, Long userId);
}
