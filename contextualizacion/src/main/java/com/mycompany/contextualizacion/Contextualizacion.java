
package com.mycompany.contextualizacion;


public class Contextualizacion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        FutbolJugador maradona=new FutbolJugador("Diego Maradona", 30, "Delantero", 1, "deportivo Tapitas", 10,3);
        
        maradona.pasar();
        
        System.out.println("el jugador :"+ maradona.getNombre() + "  esta jungando en el equipo, " +  maradona.getEquipo());
        
    }
}
