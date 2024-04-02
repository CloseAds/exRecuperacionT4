package reino;

public class Dragon extends Criatura implements Volar{

    public Dragon(String nombre, int edad) {
        super(nombre, edad);
    }

    public void volar(){
        System.out.println(getNombre() + " vuela ágilmente por los árboles");;
    }

    @Override
    public String toString() {
        return getNombre() + " escupe fuego";
    }
}
