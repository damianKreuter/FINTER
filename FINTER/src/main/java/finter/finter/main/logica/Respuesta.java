/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finter.finter.main.logica;

/**
 *
 * @author Propietario
 */
public class Respuesta {
    private int iteracion;
    private double valor;
    
    public Respuesta(int iteracion, double valor){
        this.iteracion = iteracion;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public int getIteracion() {
        return iteracion;
    }    
}
