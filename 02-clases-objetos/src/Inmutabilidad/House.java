package Inmutabilidad;

public final class House {
    // Clase final, atributos privados y final
    // Las clases inmutables no pueden ser extendidas, heredadas, no pueden ser superclases
    private final int doors;
    private final int windows;
    private final double size;

    // Método constructor y solo getters
    public House(int doors, int windows, double size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public double getSize() {
        return size;
    }
}
