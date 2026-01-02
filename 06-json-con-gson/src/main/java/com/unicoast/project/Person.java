package com.unicoast.project;

import java.util.List;
import java.util.Map;

public class Person {
    private String name;
    private Integer age;
    private String country;
    private String email;
    private Boolean active;
    private List<String> hobbies;
    private Map<String, Integer> grandSlams;

    public Person(String name, Integer age, Boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public Person(String name, Integer age, String country, Boolean active) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.active = active;
    }

    public Person(String name, Integer age, String country, Boolean active, List<String> hobbies, Map<String, Integer> grandSlams) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.active = active;
        this.hobbies = hobbies;
        this.grandSlams = grandSlams;
    }

    public Person(String name, Integer age, String country, String email, Boolean active, List<String> hobbies, Map<String, Integer> grandSlams) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.email = email;
        this.active = active;
        this.hobbies = hobbies;
        this.grandSlams = grandSlams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, Integer> getGrandSlams() {
        return grandSlams;
    }

    public void setGrandSlams(Map<String, Integer> grandSlams) {
        this.grandSlams = grandSlams;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", active=" + active +
                '}';
    }
}
