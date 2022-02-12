package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.dto.BriefSubscribe;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SubscribeMapper {
    @Insert("INSERT INTO subscribe VALUES (null,#{userId},#{status},#{startTime),#{endTime}")
    int insertSubscribe(@Param("userId") Long userId,@Param("status") Boolean status,@Param("startTime") String startTime,@Param("endTime") String endTime);

    @Select("SELECT endTime,status FROM subscribe WHERE userId=#{userId}")
    BriefSubscribe getBriefSubscribe (@Param("userId")Long userId);

    @Select("SELECT status FROM subscribe WHERE userId=#{userId}")
    Boolean getStautsByUserId(@Param("userId")Long userId);

    @Select("SELECT endTime FROM subscribe WHERE userId=#{userId}")
    Boolean getEndTimeByUserId(@Param("userId")Long userId);

    @Update("UPDATE subscribe SET status=#{status},endTime=#{endTime} WHERE userId=#{userId}")
    void updateSubscribe(@Param("status")Boolean status,@Param("userId")Long userId);



}
