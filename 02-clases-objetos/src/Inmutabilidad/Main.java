package Inmutabilidad;

public class Main {
    public static void main(String[] args) {
        // Este objeto, con esa configuración se vuelve Inmutable, no se puede modificar
        // Se debe crear una nueva instancia en vez de usar los setters
        House house = new House(2,3,10);

        System.out.println("house.getDoors() = " + house.getDoors());
    }
}
