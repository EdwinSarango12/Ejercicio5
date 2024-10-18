package org.example;

public class LibroCalificaciones {
    private String nombreDelCurso;

    private String nombrePeriodo;
    private int anio;
    private Double promedio;

    //Constructor
    public LibroCalificaciones(String nombre, String periodo, int anio, Double promedio) {
        nombreDelCurso = nombre;
        this.nombrePeriodo = periodo;
        this.anio = anio;
        this.promedio = promedio;
    }
    //setter
    public void establecerNombreDelCurso(String nombre) {
        nombreDelCurso = nombre;
    }
    public void establecerNombrePeriodo(String nombre) {
        nombrePeriodo = nombre;
    }
    public void establecerAnio(int anio) {
        this.anio = anio;
    }
    public void establecerPromedio(Double promedio) {
        this.promedio = promedio;
    }
    //getter
    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    }
    public String obtenerNombrePeriodo() {
        return nombrePeriodo;
    }
    public int obtenerAnio() {
        return anio;
    }
    public Double obtenerPromedio() {
        return promedio;
    }

    //metodo personalizado
    public void MostrarMensaje() {
        System.out.printf(" Bienvenido al libro de calificaciones para \n%s!\n",
                obtenerNombreDelCurso() );
        System.out.printf("El periodo ingresado de %s\n", obtenerNombrePeriodo() );
        System.out.printf("En el año %d\n", obtenerAnio() );
        System.out.printf("Con un promedio de %.2f\n", obtenerPromedio() );


    }

}