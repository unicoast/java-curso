package HouseExample;

public class HouseMain {
    public static void main(String[] args) {
        House myHouse = new House();
        /*
        // Atributos públicos seteados directamente, mala práctica
        myHouse.doors=2;
        myHouse.windows=4;
        myHouse.size=10;
        */
        myHouse.setDoors(2);
        myHouse.setWindows(4);
        myHouse.setSize(10);


        House myHouse2 = new House(4,6,20);

        System.out.println("La cantidad de puertas de la casa 2 es: " + myHouse2.getDoors());
        myHouse2.openDoor();
        double area =  myHouse2.calcArea();
        System.out.println("El área de la casa 2 es: " + area);
    }
}
