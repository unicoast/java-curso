public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private Engine engine; // Composición: una Motorcycle TIENE un Engine

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
        this.engine = new Engine();
    }

    public void popWheelie(){
        // Moto en una sola rueda
        System.out.println("La moto está haciendo willy");
    }

    // @Override
    public void start() {
        System.out.println("La moto se enciende");
        engine.start();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                '}' + super.toString();
    }
}
