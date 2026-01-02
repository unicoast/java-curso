package com.unicoast.exception.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayerRegistrationSystem {

    private List<Player> tennisPlayer;

    public PlayerRegistrationSystem() {
        // Inicializa la lista vacía para evitar NullPointerException
        this.tennisPlayer = new ArrayList<>();
    }

    public static void main(String[] args) {
        PlayerRegistrationSystem system = new PlayerRegistrationSystem();

        try {
            system.registerPlayer("A12345","Novak",38);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            system.registerPlayer("B12345","Roger",17);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            system.registerPlayer("12345","Nico",25);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            system.registerPlayer("A12345","Nico Dev",25);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            system.removePlayer("A99999"); // null para IllegalArgumentException
        } catch (PlayerNotFoundException e) {
            System.out.println(e.getMessage());
            // Caso ESPERADO: aquí podríamos tomar una acción de negocio,
            // por ejemplo avisar al usuario y sugerir mantener la base actualizada
            System.out.println("Mantenga su base de datos actualizada");
        } catch (Exception e){
            // Caso INESPERADO: mostramos detalles técnicos para debug
            System.out.println("Error inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void registerPlayer(String id, String name, int age) throws PlayerDuplicateException {

        validatePlayer(id, name, age);

        if (isPlayerRegistered(id)){
            throw new PlayerDuplicateException("El tenista que intenta registrar ya existe");
        }

        this.tennisPlayer.add(new Player(id, name, age));

        System.out.println("Tenista registrado correctamente");
    }

    public void removePlayer(String id) throws PlayerNotFoundException {
        if (id == null || id.trim().isEmpty()){
            throw new IllegalArgumentException("El ID no puede estar vacío");
        }

        Iterator<Player> iterator = tennisPlayer.iterator();

        while(iterator.hasNext()){
            if (iterator.next().getId().equals(id)){
                iterator.remove();
                System.out.println("Tenista eliminado correctamente");
                return;
            }
        }

        throw new PlayerNotFoundException("El tenista con ID: " + id + " no fue encontrado");
    }

    public void validatePlayer(String id, String name, int age){
        if (id == null || id.trim().isEmpty()){
            throw new IllegalArgumentException("El ID no puede estar vacío");
        }

        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if(age < 18 || age > 100){
            throw new IllegalArgumentException("La edad debe ser entre 18 y 100");
        }

        /* Valida que el ID sea: Letra mayúscula + exactamente 5 dígitos
         * Validos: "A12345", "Z99999" | No válidos: "a12345", "A123", "AB1234"
         */
        if(!id.matches("^[A-Z]\\d{5}$")){
            throw new IllegalArgumentException("El ID del tenista no es válido");
        }
    }

    public boolean isPlayerRegistered(String id){
        for (Player player: tennisPlayer){
            if (player.getId().equals(id)){
                return true;
            }
        }

        return false;
    }
}
