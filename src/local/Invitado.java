package local;

public  class Invitado {

    private String nombre;

    private int fama;

    private Fiesta fiesta;

    public Invitado(String nombre, int fama) {
        this.nombre = nombre;
        this.fama = fama;
        this.fiesta = fiesta;
    }

    public String setNombre(String nombre) throws IllegalArgumentException{
        if (nombre.isBlank() || nombre == null){
            throw new IllegalArgumentException("El nombre no puede estar en blanco");
        }
        return this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFama() {
        return fama;
    }

    public boolean setFama(int fama) {
        this.fama = fama;
        return false;
    }

    public Fiesta getFiesta() {
        return fiesta;
    }

    @Override
    public String toString() {
        return nombre + " ( " + fama + " )";
    }
}
