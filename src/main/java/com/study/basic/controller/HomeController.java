package com.study.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    // req1 요청을 처리하는 메서드
//    @GetMapping("/req1")
    @RequestMapping(method = RequestMethod.GET, value = "/req")
    public String req1() {
        System.out.println("HomeController.req1");
        return "req1";
    }

    @GetMapping("/req2")
    // 파라미터이름 = 변수이름 생략가능
    // String req2(@RequestParam String q1) / 파라미터의 이름과 변수명을 같게 하는 것이 일반적임
    public String req2(@RequestParam("q1") String q1, @RequestParam("q2") int q2) { // 리퀘스트 겟 파라미터(리퀘스트파람)을 해서 q1을 String q1에 넣음
        System.out.println("q1 = " + q1 + ", q2 = " + q2);
        return "welcome";
    }

    @PostMapping("/req3")
    public String req3(@RequestParam("p1") String p1, @RequestParam("p2") String p2) {
        System.out.println(p1 + p2 );
        return "welcome";
    }

}
