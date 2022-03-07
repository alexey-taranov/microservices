package ru.taranov.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
