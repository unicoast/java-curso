package com.unicoast.estructurasdedatos.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    private String name;
    private String dni;

    public Person(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<Person> persons = new LinkedHashSet<>();
        Person person1 = new Person("Nico","123");
        Person person2 = new Person("Máximo","456");
        Person person3 = new Person("Máximo2","4567");
        Person person4 = null;
        Person person5 = new Person("Nico2", "1234");

        // Create
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);


        // Read or List
        System.out.println(persons); // .toString() // sobreescrito

        for(Person person: persons){
            if (person != null) System.out.println(person.name);
        }

        // Delete
        persons.remove(person2);

        System.out.println(persons);

        // Update
        persons.add(person3);

        System.out.println(persons);

        // Search
        System.out.println(persons.contains(new Person("Nico","123")));

    }
}
