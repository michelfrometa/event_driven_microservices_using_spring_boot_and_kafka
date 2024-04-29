package net.javaguides.emailservice.kafka;

import lombok.extern.slf4j.Slf4j;
import net.javaguides.emailservice.kafka.events.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderConsumer {

    @KafkaListener(topics = "${spring.kafka.topic.name}")
    public void consume(OrderEvent event) {
        log.info(String.format("Order event receiver in email service => %s", event.toString()));

        // send an email to the customer
    }
}
