package proyectoFinal;

public class Main {
    public static void main(String[] args) {

        Vehicle apolloCommandModule = new Spacecraft(
                "NASA",
                "Apollo 11 - Columbia",
                1969,
                SpacecraftType.CREWED,
                100
        );

        Vehicle curiosity = new SpaceExplorationVehicle("NASA", "Curiosity Rover", 2011,85, SpacecraftType.UNCREWED_PROBE);

        // Iniciar ambos vehículos
        apolloCommandModule.start();
        curiosity.start();

        System.out.println("Nivel de Energía Apollo: " + ((PowerSource) apolloCommandModule).getEnergyLevel() + "%");
        System.out.println("Nivel de Energía Curiosity: " + ((PowerSource) curiosity).getEnergyLevel() + "%");

        // Recargar energía llamando al método recharge() de PowerSource mediante cast
        ((PowerSource) apolloCommandModule).recharge();
        ((PowerSource) curiosity).recharge();

        // Imprimir detalles
        System.out.println(apolloCommandModule);
        System.out.println(curiosity);

        System.out.println("Nivel de Energía Curiosity: " + ((PowerSource) curiosity).getEnergyLevel() + "%");
    }
}
