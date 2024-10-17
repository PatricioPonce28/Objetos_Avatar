package org.example;

public class main {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador("Johan1",666, "Ecuador");
        Jugador jugador3 = new Jugador("Joseph1" , 333, "España");

        jugador1.accion_jugador1();
        System.out.println("************************");
        jugador2.accion_jugador();
        System.out.println("************************");
        jugador3.accion_jugador();
        System.out.println("************************");
    }
}
