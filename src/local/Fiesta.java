package local;

import java.util.ArrayList;
import java.util.List;

public class Fiesta extends Invitado{

    private int glamur;
    private int aforo;

    public Fiesta(String nombre, int fama, int glamur, int aforo) {
        super(nombre, fama);
        this.glamur = glamur;
        this.aforo = aforo;
    }

    public int getGlamur() {
        return glamur;
    }

    public void entrar(int aforo) throws AforoCompletoException{
        List<Invitado> invitado = new ArrayList<>();
        if (invitado.size() > aforo){
            throw new AforoCompletoException("Aforo completo");
        }
    }

    public void salir(){

    }

}
