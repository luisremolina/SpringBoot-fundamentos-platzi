package com.fundamentos.springBoot.fundamentos.configuration;

import com.fundamentos.springBoot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplement2();
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplements();
    }

    @Bean
    public MyBeanWithDependences beanMyOperationWithDependecyImplement(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }

//    @Bean
//    public MyBeanWithProperties MyBeanWithProperties(String name, String apellido){
//        return new MyBeanWithPropertiesImplements(name, apellido);
//    }

}
