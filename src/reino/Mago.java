package reino;

public class Mago extends Criatura{

    private int nivelMagico;

    public Mago(String nombre, int edad, int nivelMagico) {
        super(nombre, edad);
        this.nivelMagico = nivelMagico;
    }

    public int getNivelMagico() {
        return nivelMagico;
    }

    public int setNivelMagico(int nivelMagico) throws IllegalArgumentException{
        if (nivelMagico > 0){
            throw new IllegalArgumentException("El nivel mágico no puede ser negativo");
        }
        return nivelMagico;
    }

    @Override
    public void realizarAccion() {
        if (nivelMagico >= 50) {
            System.out.println(getNombre() + " lanza un poderoso hechizo");;
        }
        else if (nivelMagico < 50 && nivelMagico > 0){
            System.out.println(getNombre() + " genera una pequeña chispa");
        }
        else {
            System.out.println(getNombre() + " no genera hechizos");
        }
    }

}
