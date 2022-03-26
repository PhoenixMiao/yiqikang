package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.MyMapper;
import com.phoenix.yiqikang.entity.GrowRecord;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GrowRecordMapper extends MyMapper<GrowRecord> {
    @Select("SELECT * FROM grow_record WHERE user_id=#{user_id} AND lecture_id=#{lecture_id}")
    List<GrowRecord> getGrowRecordList(@Param("user_id")Long userId,@Param("lecture_id")Long lectureId);

}
