package com.study.web;

////컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 준다.
//@RestController
//public class HelloController {
//
//    //HTTP Method인 Get의 요청을 받 을 수 있는 API를 만듦
//    //이전의 @RequestMapping(method = RequestMethod.GET)이랑 비슷
//    @GetMapping("/hello")
//    public String Hello(){
//        return "Hello";
//    }
//
//}

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
