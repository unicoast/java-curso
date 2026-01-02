package ejemploAbsInterface;

public class Main {
    public static void main(String[] args) {

        // La clase anónima es una clase sin nombre que se declara e instancia en una sola línea,
        // generalmente para sobreescribir métodos de una interfaz o de una clase abstracta
        /*
        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000) {
            @Override
            public void drive() {
                System.out.println("Estoy conduciendo!!!!");
            }
        };

        System.out.println(vehicle.toString());
        */

        Vehicle electric =
                new ElectricCar("Tesla","Model 3",2019,Color.RED, VehicleStatus.AVAILABLE, 80);

        System.out.println(electric.toString());

        electric.drive();
    }
}