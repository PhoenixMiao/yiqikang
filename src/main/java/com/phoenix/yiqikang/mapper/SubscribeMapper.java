package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.dto.BriefSubscribe;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SubscribeMapper {
    @Insert("INSERT INTO subscribe VALUES (null,#{user_id},#{status},#{start_time},#{end_time}")
    int insertSubscribe(@Param("user_id") Long userId,@Param("status") Boolean status,@Param("start_time") String startTime,@Param("end_time") String endTime);

    @Select("SELECT end_time,status FROM subscribe WHERE user_id=#{user_id}")
    BriefSubscribe getBriefSubscribe (@Param("user_id")Long userId);

    @Select("SELECT status FROM subscribe WHERE user_id=#{user_id}")
    Boolean getStatusByUserId(@Param("user_id")Long userId);

    @Select("SELECT end_time FROM subscribe WHERE user_id=#{user_id}")
    Boolean getEndTimeByUserId(@Param("user_id")Long userId);

    @Update("UPDATE subscribe SET status=#{status},end_time=#{end_time} WHERE user_id=#{user_id}")
    void updateSubscribe(@Param("status")Boolean status,@Param("user_id")Long userId,@Param("end_time")String endTime);


}
