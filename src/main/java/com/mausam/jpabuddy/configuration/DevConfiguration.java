package com.mausam.jpabuddy.configuration;

import com.mausam.jpabuddy.entity.Datasource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:qa.properties")
public class DevConfiguration {

    @Bean
    public Datasource myDatasource (@Value("${devDatasource.username}") String username,@Value("${devDatasource.password}") String password){
        Datasource datasource = new Datasource();
        datasource.setUsername(username);
        datasource.setPassword(password);
        System.out.println("USERNAME => "+datasource.getUsername());
        System.out.println("PASSWORD => "+datasource.getPassword());
        return datasource;
    }
}
