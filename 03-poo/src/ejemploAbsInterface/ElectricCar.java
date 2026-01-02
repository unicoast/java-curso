package ejemploAbsInterface;

/*
    ElectricCar hereda de Vehicle (clase abstracta) y también implementa las interfaces Electric y SelfDriving,
    combinando herencia de clase con contratos de comportamiento para cumplir funciones específicas.

    Se usan dos tipos de herencia: de clase abstracta (Vehicle) y de interfaces (permiten herencia múltiple).

    Así, ElectricCar es un Vehículo que puede realizar comportamientos eléctricos y de conducción autónoma.
*/
// ElectricCar es un Vehículo y puede realizar ciertos comportamientos.
public class ElectricCar extends Vehicle implements Electric, SelfDriving {
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, Color color, VehicleStatus vehicleStatus, int batteryLevel) {
        super(brand, model, year, color, vehicleStatus);
        this.batteryLevel = batteryLevel;
    }

    public ElectricCar(String brand, String model, int year, int batteryLevel) {
        super(brand, model, year);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void drive() {
        System.out.println("El auto eléctrico está en marcha");
    }

    @Override
    public void chargeBattery() {
        batteryLevel = MAX_BATTERY_CAPACITY;
        System.out.println("La batería está cargada al 100%");
    }

    @Override
    public void activateAutopilot() {
        System.out.println("Modo piloto automático activado");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                '}' + super.toString();
    }
}
