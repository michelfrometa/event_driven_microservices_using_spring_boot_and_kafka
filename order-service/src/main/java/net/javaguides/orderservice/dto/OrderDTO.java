package net.javaguides.orderservice.dto;

public record OrderDTO(
        String id,
        String name,
        int quantity,
        double price) {}

