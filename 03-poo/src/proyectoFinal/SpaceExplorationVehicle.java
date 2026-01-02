package proyectoFinal;
/*
    La clase SpaceExplorationVehicle es un vehículo espacial especializado que hereda atributos comunes de Vehicle y puede
    gestionar su fuente de energía mediante la interfaz PowerSource.
*/
public class SpaceExplorationVehicle extends Vehicle implements PowerSource {
    private int energyLevel;
    private SpacecraftType type;

    public SpaceExplorationVehicle(String manufacturer, String missionName, int year, int energyLevel, SpacecraftType type) {
        super(manufacturer, missionName, year);
        this.energyLevel = energyLevel;
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("El vehículo espacial inicia motores de propulsión.");
    }

    @Override
    public void recharge() {
        energyLevel = 100;
        System.out.println("La fuente de energía se ha recargado completamente.");
    }

    @Override
    public int getEnergyLevel() {
        return energyLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " - SpaceExplorationVehicle{" +
                "energyLevel=" + energyLevel +
                ", type=" + type +
                '}';
    }
}
