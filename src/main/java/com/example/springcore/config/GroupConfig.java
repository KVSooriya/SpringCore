package com.example.springcore.config;

import com.example.springcore.group.Group;
import com.example.springcore.groupimpl.Commerce;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GroupConfig {
    @Bean
    public Group commerce()
    {
        return new Commerce();
    }
}
