package com.jk.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
public class RabbitConfig {
    /**
     * 创建短信队列
     * @return
     */
    @Bean
    public Queue queue(){
        return new Queue( "sms");
    }
}
