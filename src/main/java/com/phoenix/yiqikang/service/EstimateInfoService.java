package com.phoenix.yiqikang.service;

import com.phoenix.yiqikang.entity.Estimate;

public interface EstimateInfoService {
    Estimate getEstimateInfoById(Long id);
    Estimate getExerciseInfoByName(String name);

    void deleteEstimateInfoById(Long id);
    void deleteEstimateInfoByName(String name);
}
