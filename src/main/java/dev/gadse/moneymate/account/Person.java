package dev.gadse.moneymate.account;

public record Person (
        String name
){

    public Person {
        if (name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("Name invalid: " + name);
        }
    }
}
