package com.in28minutes.springboot.myfirstwebapp.login;
import org.springframework.stereotype.Service;
@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean isValidUserName = username.equalsIgnoreCase("1111");
        boolean isValidPassword = password.equalsIgnoreCase("2222");

        return isValidUserName && isValidPassword;
    }
}
