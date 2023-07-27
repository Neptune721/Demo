package com.example.demo.mapper;

import com.example.demo.entity.User1;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper {
//查询所有用户
    @Select("select * from user")
    public List<User1> find();

    @Insert("insert into user values(#{id},#{username},#{password},#{birthday})")
    public int insert(User1 user1);

    @Update("update user set username=#{username},password=#{password},birthday=#{birthday} where id=#{id}")
    public int update(User1 user1);

    @Delete("delete from user where id=#{id}")
    public int delete(int id);
}
