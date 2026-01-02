package Static;

public class Main {
    static String appName;

    // static se ejecuta antes del bloque Main
    // Si o sí se va a ejecutar por primera vez
    static {
        appName = "Mi App Java";
        System.out.println("appName = " + appName);
    }
    
    public static void main(String[] args) {
        // Se ejecuta nuevamente
        System.out.println("appName = " + appName);

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        counter1.showCount();
        counter3.showCount();

        int result = MathUtil.square(5);

        System.out.println("result = " + result);
    }
}
