package com.example.projet_pid_2025.config;

import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThymeleafConfiguration {

    @Bean
    public LayoutDialect thymeleafeDialect(){
        return new LayoutDialect() ;
    }
}
