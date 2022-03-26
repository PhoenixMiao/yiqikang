package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.MyMapper;
import com.phoenix.yiqikang.entity.Estimate;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EstimateMapper extends MyMapper<Estimate> {
    @Select("SELECT * FROM estimate WHERE user_id=#{user_id}")
    List<Estimate> getEstimateByUserId(@Param("user_id")Long userId);
}
