package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //input de datos

        LibroCalificaciones miLibroCalificaciones1 = new LibroCalificaciones("","",0,0.0);
        System.out.println("Ingrese el nombre del curso: ");
        String nombreDelCurso = sc.nextLine();
        System.out.println("Ingrese el periodo del curso: ");
        String nombrePeriodo  = sc.nextLine();
        System.out.println("Ingrese el año del curso: ");
        int anio = sc.nextInt();
        System.out.println("Ingrese el promedio del curso: ");
        double promedio = sc.nextDouble();



        miLibroCalificaciones1.establecerNombreDelCurso(nombreDelCurso);
        miLibroCalificaciones1.establecerNombrePeriodo(nombrePeriodo);
        miLibroCalificaciones1.establecerAnio(anio);
        miLibroCalificaciones1.establecerPromedio(promedio);
        miLibroCalificaciones1.MostrarMensaje();
    }
}