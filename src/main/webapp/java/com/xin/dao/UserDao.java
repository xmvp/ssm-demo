package com.xin.dao;

import com.xin.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.xin.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id} and password = #{password}")
    User getUserByIdAndPassword(@Param("id") int id, @Param("password") String password);

}
