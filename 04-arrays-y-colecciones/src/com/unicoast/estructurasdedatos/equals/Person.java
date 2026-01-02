package com.unicoast.estructurasdedatos.equals;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        // Válida sí tiene la misma dirección de memoria
        if(this == o) return true;
        // No es un objeto null y si es de diferente tipo
        if(o == null || getClass() != o.getClass()) return false;
        // Castea el dato de tipo object que ingresa por párametro
        Person person = (Person) o;
        // Lo compara con el objeto original (this)
        return Objects.equals(name, person.name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Novak");
        Person person2 = new Person("Roger");

        System.out.println(person2.equals(person1));
    }
}
