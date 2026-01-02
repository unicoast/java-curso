//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Vehicle vehicle = new Vehicle("Fiat","Duna",2012);

        // Se deben proteger los atributos con encapsulación
        // Si se utilizan los métodos se puede controlar que lo ingresado cumpla con determinados requisitos
        // Riesgo, asignar cualquier cosa, por ejemplo:
        // vehicle.brand = "Fiat";

        vehicle.setYear(2027);

        System.out.println(vehicle.toString());*/

        /*
            Polimorfismo de inclusión o de sustitución.
            Capacidad de tratar a un objeto de una subclase como si fuera de su superclase.
            Ocurre cuando una variable de un tipo padre (superclase o interfaz) puede almacenar referencias de objetos de clases hijas.
        */
        Vehicle myCar = new Car("Toyota","Corolla", 2022,4);
        Vehicle myMotorCycle = new Motorcycle("Honda","CBR",2023, false);


        // Método start, es un método de la clase Vehicle
        // Si el método start() está declarado en Vehicle y sobrescrito en las subclases,
        // NO es necesario hacer casteo (polimorfismo).
        // myCar.start();
        // myMotorCycle.start();
        // El casteo solo es necesario si queremos usar métodos que existen SOLO en la subclase.
        // Ejemplo:
        ((Car)myCar).start();
        ((Motorcycle)myMotorCycle).start();

        // Tiempo de ejecución, puede recibir un Car o Motorcycle
        printVehicle(myMotorCycle);
        printVehicle(myCar);

        // Para acceder a los métodos de la clase específica (Car) se hace un casteo
        ((Car) myCar).setDoors(6);

        printVehicle(myCar);

    }

    // Recibe un vehículo en tiempo de ejecución
    public static void printVehicle(Vehicle vehicle){
        System.out.println(vehicle.toString());
    }
}