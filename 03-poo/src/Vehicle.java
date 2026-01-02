public class Vehicle {
    // Concepto de encapsulación, proteger los atributos
    // Los atributos deben ser privados
    private String brand;
    private String model;
    private int year;

    // El constructor es método especial
    // Mismo nombre de la clase
    // No tienen tipo de retorno ni siquiera void
    // Se ejecuta automáticamente cuando se crea un objeto
    // Sirve para asignar valores iniciales a los atributos de la clase
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    /*
    public void start(){
        System.out.println("El vehículo se enciende");
    }

    // Polimorfismo de tipo sobrecarga en tiempo de compilación (cuando escribimos código)
    // No es solo la cantidad de parámetros lo que diferencia la sobrecarga de los métodos, sino qué tipo de dato es.
    // Diferentes implementaciones de un mismo método -> Sobrecarga
    public void start(boolean silentMode){
        if (silentMode){
            System.out.println("El vehículo está en modo silencioso");
        } else {
            System.out.println("El vehículo se enciende");
        }
    }
     */

    public void stop(){
        System.out.println("El vehiculo se detiene");
    }

    // Getters y Setters
    // Métodos especiales que sirven para leer/obtener (get) y modificar (set) los valores de los atributos privados de una clase
    // Forman parte del concepto Encapsulamiento
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

    /*
        Ventajas de usar getters y setters
        Encapsulación → los atributos no son accesibles directamente.
        Control → en los setters podemos poner validaciones (ej: edad no negativa).
        Mantenimiento → si cambia la lógica interna, no afecta al resto del código.
     */
    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();

        if (year < 1886 || year > currentYear + 2){
            throw new IllegalArgumentException("Año inválido!!!!");
        }

        this.year = year;
    }

    // @Override = decorador, sobreescribir el método, característica del polimorfismo
    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                '}';
    }
}
