
package com.mycompany.contextualizacion;

public class FutbolJugador {
    
   
    // Atributos
    private String nombre;
    private int edad;
    private String posicion;    
    private int numeroCamiseta;    
    private String equipo;    
    private int golesMarcados;
     private int nivelCondicionFisica;
    

    // Constructor
    public FutbolJugador(String nombre, int edad, String posicion,  int numeroCamiseta,  String equipo, int golesMarcados, int nivelCondicionFisica) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;        
        this.numeroCamiseta = numeroCamiseta;       
        this.equipo = equipo;       
        this.golesMarcados = 0;
        this.nivelCondicionFisica=nivelCondicionFisica;
        
        
    }

    // Métodos (Comportamientos)
    public void correr() {
        System.out.println(nombre + " está corriendo.");
        nivelCondicionFisica -= 5; // Correr disminuye la condición física
    }

    public void pasar() {
        System.out.println(nombre + " ha pasado el balón.");
    }

    public void tirar() {
        System.out.println(nombre + " ha hecho un tiro a portería.");
    }

    public void defender() {
        System.out.println(nombre + " está defendiendo.");
    }

    public void marcarGol() {
        System.out.println(nombre + " ha marcado un gol!");
        golesMarcados++;
    }
   

    public void descansar() {
        System.out.println(nombre + " está descansando.");
        nivelCondicionFisica += 10; // Descansar aumenta la condición física
    }

    public void entrenar() {
        System.out.println(nombre + " está entrenando.");
        nivelCondicionFisica += 20; // Entrenar mejora la condición física
    }
    
    //getters y setters, ya que los atubutos estan en privado

    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }
     public int getNumeroCamiseta() {
        return numeroCamiseta;
    }
      public String getEquipo() {
        return equipo;
    }

    public int getNivelCondicionFisica() {
        return nivelCondicionFisica;
    }
    public int getGolesMarcados() {
        return golesMarcados;
    }

   

    
}
