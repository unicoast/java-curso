package Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Bugatti", "2013", 2000);
        vehicle.setYear(2020);
        vehicle.start();
        vehicle.accelerate();
        vehicle.stop();
        System.out.println(vehicle.toString());
    }
}
