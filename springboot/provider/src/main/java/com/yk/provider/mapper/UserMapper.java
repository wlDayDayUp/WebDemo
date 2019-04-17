package com.yk.provider.mapper;

import com.yk.provider.common.domin.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Results(id = "userMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "age", property = "age"),
            @Result(column = "sex", property = "sex")})
    @Select("SELECT * FROM u_user")
    List<User> getAll();

    @Select("SELECT * FROM u_user t WHERE t.id = #{id}")
    @ResultMap("userMap")
    List<User> getOne(Long id);
}
