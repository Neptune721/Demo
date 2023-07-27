package com.example.demo.controller;


import com.example.demo.entity.User;
import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    // http://localhost:8080/hello
    //http://localhost:8080/hello?nickname=abcd&phone=1
    @GetMapping ("/hello")
    public String hello(String nickname,String phone){
        return "hello "+nickname+"phone num= "+phone;
    }
    @PostMapping("/test1")
    public String postTest1(){
        return "post请求";
    }
    @PostMapping("/test2")
    public String postTest2(String user,String password){
        System.out.println("username:"+user);
        System.out.println("password"+password);
        return "post请求";
    }
    @PostMapping("/test3")
    public String postTest3(User user){
        System.out.println(user);
        return "post请求";
    }
    @PostMapping("/test4")
    public String postTest4(@RequestBody  User user){
        System.out.println(user);
        return "post请求";
    }
    @GetMapping("/test5/*")
    public String postTest5(){
        return "我是爸爸";
    }
}
