package com.unicoast.project;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Nico");
        user.setAge(25);
        user.setProfile("Dev");

        System.out.println(user);
    }
}