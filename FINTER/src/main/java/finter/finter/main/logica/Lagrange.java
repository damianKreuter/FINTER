/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finter.finter.main.logica;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Propietario
 */
public class Lagrange implements Algoritmo{

    @Override
    public String realizarCalculo(Collection<Integer> xs, Collection<Integer> ys) {
        //xs.size es el mismo que ys.size
        Collection<Respuesta> respuesta = hacerCalculoDePares(xs, ys);
        
        return convertirRespuestaAString(respuesta);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Respuesta> hacerCalculoDePares(Collection<Integer> xs, Collection<Integer> ys) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String convertirRespuestaAString(Collection<Respuesta> respuesta) {
//        String conversionHecha = "";
        Collection<String> respuestaEnString = new ArrayList<String>();
        respuesta.stream()
                .forEach(x-> 
                        respuestaEnString
                            .add(convertirRespuestaUnitariaEnBaseASuIteracion(x)));
//        respuestaEnString.stream().
//                forEach(x-> conversionHecha = conversionHecha.concat(x+"+"));
        
        StringBuilder conversionHecha = new StringBuilder("");
        
        //iterate through ArrayList
        for(String language : respuestaEnString){
            //append ArrayList element followed by comma
            conversionHecha.append("+").append(language);
        }
        
        //convert StringBuffer to String
        String stringObtenido = conversionHecha.toString();
        
        //remove last comma from String if you want
        stringObtenido = stringObtenido.replaceFirst("[+]", "");

        return stringObtenido;
    }

    @Override
    public Double realizarCalculoEnPar(Double x1, Double y1, Double x2, Double y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String convertirRespuestaUnitariaEnBaseASuIteracion(Respuesta respuesta) {
        String conversionUnitaria = "a x^b";
        conversionUnitaria = conversionUnitaria.replaceAll("[a]", String.valueOf(respuesta.getValor()));
        conversionUnitaria = conversionUnitaria.replaceAll("[b]", String.valueOf(respuesta.getIteracion()));
        return conversionUnitaria;
    }

    @Override
    public boolean noEstaVacio(Double dato) {
        return dato == 0;
        
    }

    
    
}
