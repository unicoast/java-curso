package ejemploAbsInterface;
/*
    Una clase abstracta en Java es una clase que no puede ser instanciada y solo sirve como base para otras clases,
    obligando a sus subclases a implementar ciertos métodos definidos sin cuerpo.
 */
public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    private Color color;
    private VehicleStatus vehicleStatus;


    public Vehicle(String brand, String model, int year, Color color, VehicleStatus vehicleStatus) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.vehicleStatus = vehicleStatus;
    }

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void stop(){
        System.out.println("El vehiculo se detiene");
    }

    // Definir comportamiento que debe ser implementado por la subclase
    public abstract void drive();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();

        if (year < 1886 || year > currentYear + 2){
            throw new IllegalArgumentException("Año inválido!!!!");
        }

        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color=" + color +
                ", vehicleStatus=" + vehicleStatus +
                '}';
    }
}
