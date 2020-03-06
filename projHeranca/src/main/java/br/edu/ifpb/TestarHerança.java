package br.edu.ifpb;

public class TestarHerança {

    public static void main( String[] args )
    {
        Professor p = new Professor(); // 900
        Professor p2 = new Professor(123, "ana", 1000, 40 );
        Gerente g = new Gerente(); // 900
        Gerente g2 = new Gerente(123, "ana", 1000, 40 );

        System.out.println( g.toString() );
        System.out.println( g2.toString() );
        System.out.println( g.getSalário() );
        System.out.println( g2.getSalário() );
    }
}
