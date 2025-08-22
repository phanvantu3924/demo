package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/form").authenticated()
                .anyRequest().permitAll()
            )
            .formLogin(login -> login
                .defaultSuccessUrl("/form", true)
                .permitAll()
            )
            .logout(logout -> logout.permitAll());
        // CSRF bật mặc định
        return http.build();
    }
}
