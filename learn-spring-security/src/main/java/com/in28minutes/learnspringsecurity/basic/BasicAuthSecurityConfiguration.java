package com.in28minutes.learnspringsecurity.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class BasicAuthSecurityConfiguration {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests( // 모든 요청 인증한다.
                auth -> {
                    auth.anyRequest().authenticated();
                });

        http.sessionManagement( // 세션 생성하지도 않고 사용도 안한다.
                session ->
                        session.sessionCreationPolicy(
                                SessionCreationPolicy.STATELESS)
        );

        //http.formLogin();


        http.httpBasic(withDefaults());

        http.csrf(csrf -> csrf.disable());// csrf 해제

        return http.build();
    }
    @Bean
    public UserDetailsService userDetailsService(){
        var user = User.withUsername("user")
                .password("{noop}dummy")
                .roles("USER")
                .build();
        var admin = User.withUsername("admin")
                .password("{noop}dummy")
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }


}
