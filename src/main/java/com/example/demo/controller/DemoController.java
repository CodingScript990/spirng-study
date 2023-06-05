package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// DemoController => Controller
@Controller // Controller bean type 을 사용하겠다는 의미
public class DemoController {
    // @Controller => IoC Container에서 관리해줘! 요청이 왔을 때 어떻게 처리 해야할지에 대한 정보를 가지고 있음

    // home method => html.file
    @RequestMapping("home") // home.html 파일을 view 단에 보여주기 위한 작업, 요청이 발생했을 때 실행되는 메서드임을 나타냄
    public String home() {
        return "home.html"; // home.html 파일을 반환해준다는 의미
    }

    // profile method => profile.html
    @RequestMapping("profile")
    public String profile() {
        return "profile.html";
    }

    // blog method => blog.html
    @RequestMapping("blog")
    public String blog() {
        return "blog.html";
    }
}
