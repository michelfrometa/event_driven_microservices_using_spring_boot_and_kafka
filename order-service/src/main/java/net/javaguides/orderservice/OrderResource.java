package net.javaguides.orderservice;

import lombok.RequiredArgsConstructor;
import net.javaguides.orderservice.dto.CreateOrderDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderResource {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Void> placeOrder(@RequestBody CreateOrderDTO order) {
        orderService.placeOrder(order);

        return ResponseEntity.ok().build();
    }
}
