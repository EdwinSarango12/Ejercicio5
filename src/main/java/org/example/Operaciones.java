package org.example;


import static java.lang.Math.sqrt;

public class Operaciones {
    private Double n1;
    private Double n2;

    public Operaciones() {
    }

    public Operaciones(Double n1, Double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    private Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    private Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    //metodos personalizados
    public void imprimirDatos(){
        System.out.println("N1: " + getN1());
        System.out.println("N2: " + getN2());
    }
    public Double sumar(){
        return n1 + n2;
    }
    public void sumaEimpresion(){
        Double suma = n1 + n2;
        System.out.println(suma);

    }
    public Double resta(){
        return n1 - n2;
    }
    public Double multiplicar(){
        return n1 * n2;
    }
    public Double dividir(){
        if (n2==0){
            System.out.println("Resultado incorrecto");
        }
        return n1 / n2;
    }


    public void raiz(){
        System.out.println(sqrt(n1));
        System.out.println(sqrt(n2));
    }
}
