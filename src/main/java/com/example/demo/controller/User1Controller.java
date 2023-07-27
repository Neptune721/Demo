package com.example.demo.controller;

import com.example.demo.entity.User1;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class User1Controller {

    //注入UserMapper
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user1")
    public List<User1> query(){
        List<User1> list=userMapper.find();
        System.out.println(list);
        return list;
    }
    @PostMapping("/user1/save")
    public String save(User1 user1){
        int i=userMapper.insert(user1);
        if(i>0){
            return "插入成功";
        }else{
            return "插入失败";
        }
    }
    @PostMapping("/user1/update")
    public String update(User1 user1){
        int i=userMapper.update(user1);
        if(i>0){
            return "更新成功";
        }else{
            return "更新失败";
        }
    }
    @PostMapping("/user1/delete")
    public String delete(int id){
        int i=userMapper.delete(id);
        if(i>0){
            return  "删除成功";
        }else{
            return  "删除失败";
        }
    }
}
