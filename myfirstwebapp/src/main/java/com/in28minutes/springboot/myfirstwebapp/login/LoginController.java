package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
//    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("login")
    public String gotoLoginPage(){
        return "login";
    }

    @PostMapping("login")
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
        model.put("name", name);
        model.put("password", password);
        return "welcome";
    }
}
