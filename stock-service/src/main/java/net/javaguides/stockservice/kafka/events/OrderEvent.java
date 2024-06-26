package net.javaguides.stockservice.kafka.events;

import net.javaguides.stockservice.domain.Status;

public record OrderEvent(
        String message,
        Status status,
        Object payload) {}

