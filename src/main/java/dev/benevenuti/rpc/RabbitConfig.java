package dev.benevenuti.rpc;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Bean
    public DirectExchange exchange() {
        return new DirectExchange("my.rpc");
    }
}
