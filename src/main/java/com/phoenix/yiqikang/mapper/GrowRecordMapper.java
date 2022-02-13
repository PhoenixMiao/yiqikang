package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.MyMapper;
import com.phoenix.yiqikang.entity.GrowRecord;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GrowRecordMapper extends MyMapper<GrowRecord> {
    @Select("SELECT * FROM growRecord WHERE userId=#{userId} AND lectureId=#{lectureId}")
    List<GrowRecord> getGrowRecordList(@Param("userId")Long userId,@Param("lectureId")Long lectureId);

}
