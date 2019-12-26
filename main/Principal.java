package main;
import punto.*;
import figura.*;
import punto.P4;

public class Principal {
    public static void main(String[] args) {

        P2 punto2 = new P2();
        P3 punto3 = new P3();
        P4 punto4 = new P4();
        P2 segundoPunto = new P2(1,2);
        P2 tercerPunto = new P2(segundoPunto);
        P3 cuartoPunto = new P3(0,0,0);
        P3 quintoPunto  =  new P3(1,2,3);
        P3 sextoPunto = new P3(segundoPunto, 2);
        P3 septimoPunto = new P3(quintoPunto);
        P4 octavoPunto = new P4(1,2,3,4);
        P4 novenoPunto = new P4(octavoPunto);
        P4 decimoPunto = new P4(septimoPunto,4);


        Triangulo equilatero = new Triangulo();
        equilatero.setPunto1(punto2);
        equilatero.setPunto2(segundoPunto);
        equilatero.setPunto3(tercerPunto);

        Cubo cubito = new Cubo();
        cubito.getVertices()[0] = new P3(4,5,6);
        cubito.getVertices()[1] = septimoPunto;
        cubito.getVertices()[2] = sextoPunto;
        cubito.getVertices()[3] = quintoPunto;

        P3[] a = cubito.getVertices();
        for (P3 p:a) {

            System.out.println(p);

        }
        cubito.setVertices(cubito.getVertices());


        System.out.println("Se calcula la distancia entre 2 puntos: "+punto2.calcularDistancia(1,1));
        System.out.println("Se calcula la distancia de un objeto que contiene 2 puntos: "+punto2.calcularDistancia(segundoPunto));

        System.out.println("Se calcula la distancia entre 3 puntos: "+punto3.calcularDistancia(1,2,3));
        System.out.println("Se calcula la distancia de un objeto que contiene 3 puntos"+punto3.calcularDistancia(sextoPunto));
        System.out.println("Se calcula la distancia entre un objeto que contiene 2 y un punto externo: "+punto3.calcularDistancia(tercerPunto, 3));

        System.out.println("Se calcula la distancia entre 4 puntos: "+punto4.calcularDistancia(1,2,3,4));
        System.out.println("Se calcula la distancia entre 4 puntos de un objeto: "+punto4.calcularDistancia(novenoPunto));
        System.out.println("Se calcula la distancia entre un objeto que contiene 3 puntos con otro punto externo: "+punto4.calcularDistancia(quintoPunto,4));

        System.out.println(cuartoPunto);
        System.out.println(quintoPunto);
        System.out.println(sextoPunto);
        System.out.println(septimoPunto);
        System.out.println(octavoPunto);
        System.out.println(novenoPunto);
        System.out.println(decimoPunto);

        System.out.println(equilatero);

        //P2 pruebaLiskov = new P3();
        //((P3)pruebaLiskov)







    }
}
