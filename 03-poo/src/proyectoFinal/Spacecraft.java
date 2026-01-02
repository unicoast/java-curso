package proyectoFinal;

public class Spacecraft extends Vehicle implements PowerSource {
    private SpacecraftType type;
    private int energyLevel;

    public Spacecraft(String manufacturer, String missionName, int year, SpacecraftType type, int energyLevel) {
        super(manufacturer, missionName, year);
        this.type = type;
        this.energyLevel = energyLevel;
    }

    @Override
    public void start() {
        System.out.println("La nave enciende propulsor de despegue.");
    }

    @Override
    public void recharge() {
        energyLevel = 100;
        System.out.println("La energía de la nave se recarga.");
    }

    @Override
    public int getEnergyLevel() {
        return energyLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " - Tipo: " + type + " - Nivel de Energía: " + energyLevel + "%";
    }
}
