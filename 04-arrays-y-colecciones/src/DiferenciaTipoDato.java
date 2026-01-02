public class DiferenciaTipoDato {
    public static void main(String[] args) {
        // Los elementos no inicializados en un array de tipos primitivos (int) se inicializan a 0 automáticamente.
        int[] numbersPrimitive = new int[5];

        numbersPrimitive[0] = 10;
        numbersPrimitive[1] = 20;

        // Los elementos no inicializados en un array de clases envolventes (Wrapper) se inicializan a null automáticamente.
        Integer[] numbersWrapper = new Integer[5];

        numbersWrapper[0] = 30;
        numbersWrapper[1] = null;

        System.out.println("Tipo int");
        for (int number: numbersPrimitive){
            System.out.println(number);
        }

        System.out.println("Tipo Integer");
        for (Integer number: numbersWrapper){
            System.out.println(number);
        }

    }
}
