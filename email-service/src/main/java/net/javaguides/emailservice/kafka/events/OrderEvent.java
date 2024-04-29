package net.javaguides.emailservice.kafka.events;

public record OrderEvent(
        String message,
        Status status,
        Object payload) {}

