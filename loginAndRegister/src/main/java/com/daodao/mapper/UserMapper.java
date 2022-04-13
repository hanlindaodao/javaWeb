package com.daodao.mapper;

import com.daodao.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from tb_user where username = #{username} and password = #{password}")
    User select(@Param("username") String username, @Param("password") String password);

    List<User> selectAll();

    @Select("select * from tb_user")
    List<User> selectAllAnno();

    User selectById(int id);

    @Select("select * from tb_user where id = #{id}")
    User selectByIdAnno(int id);

    List<User> selectByCondition(@Param("id") int id,
                                 @Param("username") String username,
                                 @Param("password") String password);

}
