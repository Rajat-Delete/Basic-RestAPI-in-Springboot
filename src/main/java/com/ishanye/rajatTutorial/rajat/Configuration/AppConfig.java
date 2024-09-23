package com.ishanye.rajatTutorial.rajat.Configuration;


import com.ishanye.rajatTutorial.rajat.DB;
import com.ishanye.rajatTutorial.rajat.DevDB;
import com.ishanye.rajatTutorial.rajat.ProdDB;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "production")
    public DB getProdDBBean(){
        return new ProdDB();
    }

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "development")
    public DB getDevDBBean(){
        return new DevDB();
    }
}
