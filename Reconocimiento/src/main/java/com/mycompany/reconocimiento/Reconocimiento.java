

package com.mycompany.reconocimiento;
import java.util.Scanner;

public class Reconocimiento {

    // Función X: Solicita los nombres de los estudiantes
    public static String[] ingresarNombres(int cantidadEstudiantes) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[cantidadEstudiantes];
        
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        return nombres;
    }

//Solicitamos las notas de los estudiantes
    public static double[] ingresarNotas(int cantidadEstudiantes) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[cantidadEstudiantes];
        
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + " (de 1.0 a 10.0): ");
            double nota = scanner.nextDouble();

            // Validar que la nota esté entre 1.0 y 10.0
            if (nota >= 1.0 && nota <= 10.0) {
                notas[i] = nota;
            } else {
                System.out.println("Error: La nota debe estar entre 1.0 y 10.0. Inténtelo de nuevo.");
                i--; // Restar 1 al contador para repetir la entrada de nota para el mismo estudiante
            }
        }
        return notas;
    }

    // Función que calcula el promedio del curso
    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Función principal
    public static void main(String[] args) {
        int cantidadEstudiantes = 5;

        // Llamar a las funciones para obtener los nombres y notas de los estudiantes
        String[] nombres = ingresarNombres(cantidadEstudiantes);
        double[] notas = ingresarNotas(cantidadEstudiantes);

        // Calcular el promedio del curso
        double promedio = calcularPromedio(notas);
        System.out.println("Promedio del curso: " + promedio);

        // Imprimir los estudiantes con notas por debajo del promedio
        System.out.println("Estudiantes con notas por debajo del promedio:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (notas[i] < promedio) {
                System.out.println(nombres[i] + ": " + notas[i]);
            }
        }
    }
}
