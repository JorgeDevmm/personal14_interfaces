package com.jmonzon.auxiliar;

/**
 * @author Jorge Monzón
 * @project ejercicio14_interfaces
 */
public interface Proceso {

    void imprimir();
    void aumentar(int c);

    default void firmar(){
        System.out.println(this.toString());
    }
}
