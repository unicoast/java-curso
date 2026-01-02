public class Engine {
    public void start(){
        System.out.println("El motor se encendió");
    }

    public void start(boolean silentMode){
        if (silentMode){
            System.out.println("El vehículo está en modo silencioso");
        } else {
            System.out.println("El vehículo se enciende");
        }
    }
}
