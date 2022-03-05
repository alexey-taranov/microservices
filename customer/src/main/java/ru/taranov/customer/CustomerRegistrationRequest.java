package ru.taranov.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastname,
        String email) {
}
