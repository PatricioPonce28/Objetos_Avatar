package org.example;
public class Jugador {

        String avatar;
        int edad;
        String pais;

        public Jugador() {
            avatar = "Monstro1";
            edad = 555;
            pais = "Alemania";
        }

    public Jugador(String avatar, int edad, String pais) {
        this.avatar = avatar;
        this.edad = edad;
        this.pais = pais;
    }

    public int num_saltos(int a){
            int s = 2+a;
            return s;
    }

    public void accion_jugador1(int s){
            System.out.println(avatar +  " puede patear y comer");
            System.out.println("Tiene. " + edad + "años y es de: " + pais);
            int a = num_saltos(s);
            System.out.println(a +" Es el número de saltos");
        }

        public void accion_jugador(int s){
            System.out.println(avatar + " puede patear, correr y saltar");
            System.out.println("Tiene. " + edad + "años y es de: " + pais);
            int a = num_saltos(s);
            System.out.println(a+" Es el número de saltos");
            }


}
