package net.javaguides.orderservice.dto;

public record CreateOrderDTO(
        String name,
        int quantity,
        double price) {}

