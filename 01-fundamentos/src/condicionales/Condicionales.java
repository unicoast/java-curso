package condicionales;

public class Condicionales {
    public static void main(String[] args) {
        int age = 18;
        double average = 7.5;

        boolean isAdult = age > 16;
        boolean hasPassingGrade = average >= 7;

        if(isAdult && hasPassingGrade){
            System.out.println("El estudiante cumple con todos los requisitos");
        }

        if(isAdult){
            System.out.println("Es adulto");
        }
    }
}
