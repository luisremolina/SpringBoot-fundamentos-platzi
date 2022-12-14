package com.fundamentos.springBoot.fundamentos.configuration;

import com.fundamentos.springBoot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.springBoot.fundamentos.bean.MyBeanWithPropertiesImplements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfiguration {

    @Value("${value.name}")
    private String name;

    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random}")
    private String random;

    @Bean
    public MyBeanWithProperties function(){
        return new MyBeanWithPropertiesImplements(name, apellido);
    }

}
