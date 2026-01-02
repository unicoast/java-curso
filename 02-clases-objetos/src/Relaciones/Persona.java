package Relaciones;

public class Persona {
    // Ejemplo relación de dependencia
    public void calculateSum(Calculator calculator){
        // Se puede utilizar la clase completa y usar todos los métodos
        int result = calculator.add(5,3);

        System.out.println("Suma = " + result);
    }
}
