package net.javaguides.orderservice.kafka.events;

import net.javaguides.orderservice.kafka.Status;

public record OrderEvent(
        String message,
        Status status,
        Object payload) {}

