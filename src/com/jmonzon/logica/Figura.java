package com.jmonzon.logica;

/**
 * @author Jorge Monzón
 * @project ejercicio10_clases_abstractas
 */
public abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double superficie();
}
