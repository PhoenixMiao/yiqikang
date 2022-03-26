package com.phoenix.yiqikang.mapper;

import com.phoenix.yiqikang.MyMapper;
import com.phoenix.yiqikang.controller.response.UserResponse;
import com.phoenix.yiqikang.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper extends MyMapper<User> {
    @Select("SELECT username,telephone,portrait,email FROM user WHERE id=#{id};")
    UserResponse getUserById(@Param("id")Long id);

    @Update("UPDATE user SET username = #{username},telephone = #{telephone},portrait = #{portrait},email = #{email} WHERE id=#{id};")
    void updateUserById(@Param("username")String username,
                        @Param("telephone")String telephone,
                        @Param("portrait")String portrait,
                        @Param("email")String email);

    @Update("UPDATE user SET username=#{username} WHERE id=#{id}")
    void updateUsername(@Param("username")String username,@Param("id")Long id);

    @Update("UPDATE user SET telephone=#{telephone} WHERE id=#{id}")
    void updateTelephone(@Param("telephone")String telephone,@Param("id")Long id);

    @Update("UPDATE user SET email=#{email} WHERE id=#{id}")
    void updateEmail(@Param("email")String email,@Param("id")Long id);

    @Update("UPDATE user SET portrait=#{portrait} WHERE id=#{id}")
    void updatePortrait(@Param("portrait")String portrait,@Param("id")Long id);

    @Update("UPDATE user SET estimate_times=#{estimate_times} WHERE id=#{id}")
    void estimate(@Param("estimate_times")Integer estimateTimes,@Param("id")Long id);


    //void updateUserById(Object username, Object telePhone, Object portrait, Object email, Long id);
}
