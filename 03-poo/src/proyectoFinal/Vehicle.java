package proyectoFinal;

public abstract class Vehicle {
    private String manufacturer;
    private String missionName;
    private int year;

    public Vehicle(String manufacturer, String missionName, int year) {
        this.manufacturer = manufacturer;
        this.missionName = missionName;
        this.year = year;
    }

    public abstract void start();

    public void stop(){
        System.out.println("El vehículo se detiene");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", missionName='" + missionName + '\'' +
                ", year=" + year +
                '}';
    }
}
