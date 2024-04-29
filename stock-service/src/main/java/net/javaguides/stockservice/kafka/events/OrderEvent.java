package net.javaguides.stockservice.kafka.events;

import net.javaguides.stockservice.kafka.Status;

public record OrderEvent(
        String message,
        Status status,
        Object payload) {}

