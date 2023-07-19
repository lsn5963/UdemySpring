package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class WelcomeController {


//    public LoginController(AuthenticationService authenticationService) {
//        this.authenticationService = authenticationService;
//    }

    @GetMapping("/")
    public String gotoWelcomePage(ModelMap model){
        model.put("name", "in28minutes");
        return "welcome";
    }

//    @PostMapping("login")
//    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
//        if(authenticationService.authenticate(name,password)){
//            model.put("name", name);
//            model.put("password", password);
//            return "welcome";
//        }else{
//            model.put("errorMessage", "Invalid Credentials");
//            return "login";
//        }
}
