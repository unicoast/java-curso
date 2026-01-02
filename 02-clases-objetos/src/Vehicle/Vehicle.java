package Vehicle;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("El vehículo está encendido.");
    }

    public void stop() {
        System.out.println("El vehículo está apagado.");
    }

    public void accelerate() {
        System.out.println("El vehículo está acelerando...");
    }

    // Getters and setters omitted for brevity

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
        if (year < 1886 || year > currentYear + 2) {
            throw new IllegalArgumentException("Año inválido. Debe estar entre 1886 y " + (currentYear + 2) + ".");
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
