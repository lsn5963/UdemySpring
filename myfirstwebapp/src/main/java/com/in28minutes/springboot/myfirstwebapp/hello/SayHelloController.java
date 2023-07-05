package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody // 메시지가 리턴한 것 그대로를 브라우저에 리턴하는 것
    public String sayHello() {
        return "Hello! What are you learning today?"; // 오류가 나는 이유는 문자열을 리턴할 때 Hello! What are you learning today? 라고 된 뷰를 검색하기 때문에
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My First HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page with body - Changed");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello"; // 오류가 나는 이유는 문자열을 리턴할 때 Hello! What are you learning today? 라고 된 뷰를 검색하기 때문에
    }
}
