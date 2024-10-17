package org.example;
public class Jugador {

        String avatar;
        int edad;
        String pais;

        public Jugador() {
            avatar = "Monstro1";
            edad = 999;
            pais = "Alemania";
        }

    public Jugador(String avatar, int edad, String pais) {
        this.avatar = avatar;
        this.edad = edad;
        this.pais = pais;
    }

    public void accion_jugador1(){
            System.out.println(avatar +  " puede patear y comer");
            System.out.println("Tiene. " + edad + "años y es de: " + pais);
        }

        public void accion_jugador(){
            System.out.println(avatar + " puede patear, correr y saltar");
            System.out.println("Tiene. " + edad + "años y es de: " + pais);
            }

}
