package Intervalo;

import I014.punto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Intervalo {
    public static void main(String[] args) {
        Intervalo intervalo = new Intervalo(1, 99);
        System.out.println(intervalo.obtenerLongitud());
    }
    private double intervaloMax;
    private double intervaloMin;
    // Constructores
    public Intervalo (double intervaloMin, double intervaloMax){
        if(intervaloMin > intervaloMax) {
            throw new RuntimeException("Whoops");
        }
        this.intervaloMax = intervaloMax;
        this.intervaloMin = intervaloMin;
    }
    public Intervalo(){
        this.intervaloMin=0;
        this.intervaloMax=0;
    }
    public Intervalo(double limiteSimetrico){
        this.intervaloMax = intervaloMax;
        this.intervaloMin = (-1)*intervaloMax;
    }
    public Intervalo(Intervalo intervalo){
        this(intervalo.intervaloMin, intervalo.intervaloMax);
    }
    // Stuffs
    public double getIntervaloMax() {
        return intervaloMax;
    }
    public void setIntervaloMax(double intervaloMax) {
        this.intervaloMax = intervaloMax;
    }
    public double getIntervaloMin() {
        return intervaloMin;
    }
    public void setIntervaloMin(double intervaloMin) {
        this.intervaloMin = intervaloMin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Intervalo intervalo = (Intervalo) o;
        return Double.compare(intervaloMax, intervalo.intervaloMax) == 0 && Double.compare(intervaloMin, intervalo.intervaloMin) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intervaloMax, intervaloMin);
    }

    // Métodos
    public void visualizar (Intervalo intervalo){
        System.out.println("[" + intervalo.intervaloMin + ", " + intervalo.intervaloMax + "]" );
    }
    public double obtenerLongitud(){
        return intervaloMax - intervaloMin;
    }

}
