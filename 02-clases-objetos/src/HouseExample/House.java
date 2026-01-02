package HouseExample;

public class House {
    // Los atributos deberían ser privados
    // (Modificadores de acceso)
    private int doors;
    private int windows;
    private double size;

    // Constructor vacío
    // Es un método especial
    // Inicializar los atributos del objeto y establecer el estado
    public House() {
    }

    // Sobrecarga de constructores. mismo método pero se diferencia
    // por la cantidad de párametros
    public House(int doors, int windows, double size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    // Los métodos normalmente son públicos
    // (Modificadores de acceso)
    public void openDoor(){
        System.out.println("La puerta está abierta");
    }

    public double calcArea(){
        return size * size;
    }
}
