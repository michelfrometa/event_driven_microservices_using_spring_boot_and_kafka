package net.javaguides.orderservice;

import lombok.RequiredArgsConstructor;
import net.javaguides.orderservice.dto.CreateOrderDTO;
import net.javaguides.orderservice.kafka.OrderProducer;
import net.javaguides.orderservice.kafka.Status;
import net.javaguides.orderservice.kafka.events.OrderEvent;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderProducer orderProducer;

    /**
     * Create a new order
     *
     * @param order {@link CreateOrderDTO} the data to create an order
     */
    public void placeOrder(CreateOrderDTO order) {

        OrderEvent event = new OrderEvent("order status changed", Status.PENDING, order);

        orderProducer.sendMessage(event);

    }
}
