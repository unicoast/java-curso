package Relaciones;

public class House {
    // La idea es asociar las 3 clases como atributos de la clase House
    // Clases como atributos -> relación
    private Room room; // composición, se destruye la casa, se destruye la habitación
    private Door door;
    private Owner owner; // asociación, se destruye la casa pero el propietario no

    public House(Room room, Door door, Owner owner) {
        this.room = room;
        this.door = door;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "room=" + room +
                ", door=" + door +
                ", owner=" + owner +
                '}';
    }
}
