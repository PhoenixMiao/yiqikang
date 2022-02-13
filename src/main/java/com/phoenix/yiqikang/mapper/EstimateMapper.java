package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.MyMapper;
import com.phoenix.yiqikang.entity.Estimate;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EstimateMapper extends MyMapper<Estimate> {
    @Select("SELECT * FROM estimate WHERE userId=#{userId}")
    List<Estimate> getEstimateByUserId(@Param("userid")Long userId);
}
