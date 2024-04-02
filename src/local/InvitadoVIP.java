package local;

public class InvitadoVIP extends Invitado{

    private static final int fama_vip = 10;

    private InvitadoVIP(String nombre) {
        super(nombre, fama_vip);
    }

    public static InvitadoVIP crearInvitadoVIP (String nombre){
        return new InvitadoVIP(nombre);
    }

}
