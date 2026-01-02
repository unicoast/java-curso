package ejemploAbsInterface;

/*
    Una interface en Java es una "plantilla" que define un conjunto de métodos y constantes que otras clases
    deben implementar, pero no contiene la lógica interna de esos métodos
 */
public interface Electric {
    int MAX_BATTERY_CAPACITY = 100;
    void chargeBattery();
}
