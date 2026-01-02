package com.unicoast.exception.personalized.checked;

public class AgeValidator {
    public static void main(String[] args) {
        Person tennisPlayer = null;
        try {
            tennisPlayer = Person.createPerson("Novak", 38);
            System.out.println(tennisPlayer.toString());
        } catch (AgeValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
