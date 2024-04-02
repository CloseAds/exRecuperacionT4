package local;

public class InvitadoNormal extends Invitado{

    private static final int fama_normal = 2;

    public InvitadoNormal(String nombre) {
        super(nombre, fama_normal);
    }

    public static InvitadoNormal crearInvitadoNormal(String nombre){
        return new InvitadoNormal(nombre);
    }

}
