package com.phoenix.yiqikang.mapper;

import org.apache.ibatis.annotations.*;

public interface FavoritiesMapper {

    @Insert("INSERT INTO favorties(user_id,course_id) VALUES (#{user_id},#{course_id});")
    Long newFavorities(@Param("user_id")Long userId,@Param("course_id")Long courseId);

    @Delete("DELETE FROM favorities WHERE user_id=#{user_id} AND course_id=#{course_id};")
    Long deleteFavorities(@Param("user_id")Long userId,@Param("course_id")Long courseId);

    @Select("SELECT courseId FROM favorities WHERE user_id=#{user_id}")
    long getUserFavoritiesId(@Param("user_id")Long userId);

//    @Select("SELECT * FROM ")
//


}
