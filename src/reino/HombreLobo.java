package reino;

public class HombreLobo extends Criatura{

    public HombreLobo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String toString() {
        return  getNombre() + " aúlla a la luna";
    }

}
