/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finter.finter.main.logica;

import java.util.Collection;

/**
 *
 * @author Propietario
 */
public interface Algoritmo {
    public String realizarCalculo(Collection<Integer> xs, Collection<Integer> ys);
   
    public Collection<Respuesta> hacerCalculoDePares(Collection<Integer> xs, Collection<Integer> ys);
    
    public Double realizarCalculoEnPar(Double x1, Double y1, Double x2, Double y2);
    
    public String convertirRespuestaAString(Collection<Respuesta> respuesta);
    
    public String convertirRespuestaUnitariaEnBaseASuIteracion(Respuesta respuestaUnitaria);
    
    public boolean noEstaVacio(Double dato);
}
