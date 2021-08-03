package dev.benevenuti.rpc;

import lombok.extern.java.Log;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
@Log
public class MyRPCCaller {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private DirectExchange exchange;

    int start = 0;

    @Scheduled(fixedRate = 1000, initialDelay = 500)
    private void produceWork() {
        Long result = (Long)rabbitTemplate.convertSendAndReceive(exchange.getName(), "rpc", start++);
        log.warning(start + "th fib: " + result);
    }


}
