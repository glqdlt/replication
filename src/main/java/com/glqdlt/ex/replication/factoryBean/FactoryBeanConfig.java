package com.glqdlt.ex.replication.factoryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {

    @Bean
    public Message message() throws Exception {

        return new MessageFactoryBean("qweqwe").getObject();

    }
}
