package com.unicoast.exception.personalized.checked;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Excepción checked para validar edad, extiende de Exception.
     * Se lanza cuando la edad no cumple requisitos mínimos (ej: 18 años).
     * Obliga manejo explícito para garantizar validación antes de procesar.
     */
    public static Person createPerson(String name, Integer age) throws AgeValidationException {
        if(age<18){
            throw new AgeValidationException("Debe ser mayor de edad");
        }

        return new Person(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
