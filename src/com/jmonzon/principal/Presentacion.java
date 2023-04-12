//Crear un interfaz llamada proceso que incluya dos métodos:

//imprimir() mostrará los valores de los atributos del objeto que la implemente
//aumentar(int c) Aumentará los valores de los atributos del objeto que la implemente en la cantidad
//recibida

//Posteriormente, está interfaz será implementada por circulo y por una nueva clase mesa que crearemos

package com.jmonzon.principal;

import com.jmonzon.auxiliar.Proceso;
import com.jmonzon.logica.Circulo;
import com.jmonzon.varios.Mesa;

/**
 * @author Jorge Monzón
 * @project ejercicio14_interfaces
 */
public class Presentacion {

    public static void main(String[] args) {

//        Aplicamos polimorfimos de clases que implementan a la interfaz Proceso
        operarObjeto(new Circulo("verde", 3));
        operarObjeto(new Mesa(2, 9));

    }

    //    puedo aplicar cualquier objeto que la implementan por medio de polimorfismo a la interfaz
    static void operarObjeto(Proceso op) {
//      aumenta el valor de los valores del objeto
        op.aumentar(9);
        op.imprimir();
//        llamando al método default de la interfaz
        op.firmar();

    }
}
