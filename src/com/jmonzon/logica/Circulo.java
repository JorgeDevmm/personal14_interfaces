package com.jmonzon.logica;

import com.jmonzon.auxiliar.Proceso;

/**
 * @author Jorge Monzón
 * @project ejercicio10_clases_abstractas
 */
public class Circulo extends Figura implements Proceso {

    private int radio;

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double superficie() {
        return Math.PI * radio * radio;
    }


    @Override
    public void imprimir() {
        System.out.println("El radio es: " + radio);

    }

    @Override
    public void aumentar(int c) {
        radio+= c;
    }
}
