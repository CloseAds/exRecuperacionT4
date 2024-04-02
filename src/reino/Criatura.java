package reino;

public abstract class Criatura {

    private String nombre;

    private int edad;

    private int energia;

    public Criatura(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar en blanco");
        }
        return this.nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int setEdad(int edad) {
        if (edad > 0 ){
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        return this.edad;
    }

    public void realizarAccion(){

    }

}
