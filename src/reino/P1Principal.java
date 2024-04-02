package reino;

public class P1Principal {

    public static void main(String[] args) {

        HombreLobo hl1 = new HombreLobo("Lobezno", 50);
        System.out.println(hl1);

        Elfo e1 = new Elfo("Tomas", 250);
        System.out.println(e1);

        Dragon d1 = new Dragon("Chispas", 700);
        System.out.println(d1);

        d1.volar();

        Mago m1 = new Mago("Wizard", 80, 60);
        m1.realizarAccion();

        Mago m2 = new Mago("Jeremías", 69, 30);
        m2.realizarAccion();

    }

}
