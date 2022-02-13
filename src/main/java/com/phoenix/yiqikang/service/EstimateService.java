package com.phoenix.yiqikang.service;

import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.controller.response.EstimateResponse;
import com.phoenix.yiqikang.dto.Visualization;
import com.phoenix.yiqikang.entity.Estimate;
import com.phoenix.yiqikang.entity.EstimateQuestion;

import java.util.ArrayList;
import java.util.List;

public interface EstimateService {
    List<EstimateQuestion> getEstimateQuestionList();

    EstimateResponse submitEstimate(Long userId,String answer);

    Page<Estimate> getEstimateList(int pageNum,int pageSize,Long userId);

    EstimateResponse getEstimateResult(Long estimateId);

    ArrayList<ArrayList<Visualization>> visualize(Long userId);
}
