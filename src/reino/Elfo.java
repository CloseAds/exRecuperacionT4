package reino;

public class Elfo extends Criatura{

    public Elfo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String toString() {
        return  getNombre() + " dispara una flecha mágica";
    }
}
