
public class EjercicioArray {
    public static void main(String[] args) {
        /*
            Dado un arreglo de enteros, elimina el elemento que está en una posición determinada (por ejemplo, la posición 2) y desplaza todos
            los elementos siguientes una posición hacia la izquierda. El último elemento del arreglo se debe poner en 0 para mantener el tamaño
            original del arreglo.
        */

        // Definimos el arreglo con valores iniciales
        int[] numbersPrimitive = {1,2,3,4,5,6,0,9};

        // Posición que queremos eliminar
        int deletePosition = 2;

        // Desplazamos los elementos a la izquierda, sobrescribiendo el que queremos eliminar
        for (int i = deletePosition; i < numbersPrimitive.length - 1; i++){
            numbersPrimitive[i] = numbersPrimitive[i + 1];
        }

        // Ponemos a 0 el último elemento, ya que se ha 'eliminado' uno
        numbersPrimitive[numbersPrimitive.length - 1] = 0;


        numbersPrimitive[0] = 200;
        // Imprimimos el arreglo final
        for (int number: numbersPrimitive){
            System.out.println(number);
        }

    }
}
