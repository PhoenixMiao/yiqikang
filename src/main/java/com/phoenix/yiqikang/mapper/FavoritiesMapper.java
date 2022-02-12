package com.phoenix.yiqikang.mapper;

import org.apache.ibatis.annotations.*;

public interface FavoritiesMapper {

    @Insert("INSERT INTO favorties(userId,courseId) VALUES (#{userId},#{courseId});")
    Long newFavorities(@Param("userId")Long userId,@Param("courseId")Long courseId);

    @Delete("DELETE FROM favorities WHERE userId=#{userId} AND courseId=#{courseId};")
    Long deleteFavorities(@Param("userId")Long userId,@Param("courseId")Long courseId);

    @Select("SELECT courseId FROM favorities WHERE userId=#{userId}")
    long getUserFavoritiesId(@Param("userId")Long userId);

//    @Select("SELECT * FROM ")
//


}
