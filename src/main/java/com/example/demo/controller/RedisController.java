package com.example.demo.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.concurrent.TimeUnit;

@RestController
public class RedisController {
       @Resource
       private RedisTemplate   redisTemplate;

       @GetMapping ("/setGet")
       public String setGetValue(String key,String value){
              redisTemplate.opsForValue().set("hello","zhangsan");
              redisTemplate.expire("hello",20, TimeUnit.SECONDS);
              return (String) redisTemplate.opsForValue().get("hello");
       }
       //localhost:8080/login1?username=zhangsan&password=123
       @GetMapping("/login1")
       public String login(String username, String password, HttpSession session){
              //判断账号密码是否匹配
              //用户信息存储到session
              session.setAttribute("username",username);
              return "登陆成功";
       }

       @GetMapping("/buy")
       public String Buy(){
              return "购买成功";
       }
}
