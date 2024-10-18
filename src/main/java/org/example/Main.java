package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);  //input de datos

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
        miLibroCalificaciones1.MostrarMensaje();*/

        Scanner sc = new Scanner(System.in);

        Operaciones operaciones = new Operaciones();

        int opcion;
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el primer numero: ");
            Double n1 = sc.nextDouble();
            operaciones.setN1(n1);
            System.out.println("Ingrese el segundo numero: ");
            Double n2 = sc.nextDouble();
            operaciones.setN2(n2);
            System.out.println("Ingrese que acción quiere realizar: ");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir del programa");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(operaciones.sumar());
                    break;
                case 2:
                    System.out.println(operaciones.resta());
                    break;
                case 3:
                    System.out.println(operaciones.multiplicar());
                    break;
                case 4:
                    System.out.println(operaciones.dividir());
                    break;
                case 5:
                    continuar= false;
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opcion no valida. Ingrese nuevamente");
                    break;
            }

        }
    }
}