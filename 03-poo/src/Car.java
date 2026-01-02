public class Car extends Vehicle {
    private int doors;
    private Engine engine; // Composición: un Car TIENE un Engine

    // En la herencia de clases solo se puede heredar de una única clase

    public Car(String brand, String model, int year, int doors) {
        // Método super sirve para setear los atributos asociados a la superclase Vehicle
        // super(...) inicializa los atributos heredados de la clase Vehicle
        super(brand, model, year); // No crea los demás getters y setters, porque ya se tiene acceso de forma directa a partir de la herencia
        // El this hace referencia al objeto actual de la clase, es decir al objeto que está ejecutando el método o el constructor en ese momento
        this.doors = doors;
        // Se crea un nuevo objeto Engine como parte del coche (relación de composición: un Car contiene un Engine).
        this.engine = new Engine();
    }

    // Sobrescritura ocurre cuando una subclase (Car) redefine un método de la superclase (Vehicle)
    // Sobreescribir su comportamiento
    // @Override // Se comenta, ya no hay herencia si se trata de composición
    public void start() {
        System.out.println("El auto se enciende");
        engine.start(); // Como tenemos motor, se enciende
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                '}' + super.toString();
    }
}
