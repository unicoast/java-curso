package com.unicoast.estructurasdedatos.Set.HashSet;

import java.util.HashSet;
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

    /*
        hashCode() solo depende de dni, varios objetos con el mismo dni van a tener el mismo hashCode (colisión de hash),
        pero eso no impide que la colección pueda almacenar varios elementos; simplemente agrupa esos objetos en el mismo
        bucket y luego los distingue usando equals
     */
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
        Set<Person> persons = new HashSet<>();
        Person person1 = new Person("Nico","123");
        Person person2 = new Person("Máximo","456");
        Person person3 = new Person("Máximo2","456");
        Person person4 = null;

        // En el momento de añadir, calcula el hashCode del nuevo objeto.
        // Busca en la tabla interna si hay un elemento con el mismo hashCode, si no, lo agrega, no pasa por el equals.
        // Si hay uno o más (colisión), usa el equals para comparar con esos objetos, solo con esos (eficaz).

        // Create
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);


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

    }
}
