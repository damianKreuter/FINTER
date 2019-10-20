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
        int grado = xs.size()-1;
        
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

       public Lagrange() {
//        this.espaciado = 0;
//        this.decimales = 10;
    }

    public double evaluar(double[] xi, double[] fxi, double x) {

        int n = xi.length;




        double[] Lxi = new double[n];
        double Pnx = 0;




        System.out.println("--------------------------------------------------");
        System.out.println("------------Interpolacion de Lagrange-------------");
        System.out.println("--------------------------------------------------");
        
        this.reportarcoordenadas(xi, fxi);

        System.out.println("x = "+x);
        System.out.println("");

        System.out.println("Y(x)=[");
        for (int i = 0; i < n; i++) {

//            System.out.print(this.redondear(fxi[i]));
            System.out.print(" * ");
            Lxi[i] = this.Lagrangeix(x, i, xi, n);

            Pnx = Pnx + Lxi[i] * fxi[i];

            System.out.println("");

        }

        System.out.println("]");
        System.out.println("");
        System.out.println("Resultado:");
//        System.out.println("Pnx=" + this.redondear(Pnx));

        return Pnx;

    }

    public double Lagrangeix(double x, int i, double[] xi, int n) {

        double Prod;

        Prod = 1;

        for (int j = 0; j < n; j++) {

            if (i != j) {
              
//                System.out.print("((x-" + this.redondear(xi[j]) + ")/(" + this.redondear(xi[i]) + " - " + this.redondear(xi[j]) + "))");
                Prod = Prod * ((x - xi[j]) / (xi[i] - xi[j]));

                if (j == (n - 1)) {

                    System.out.print(" + ");
                }

            }

           


        }

        return Prod;
    }
    
    public void consola() {

//        Consola consola = new Consola();
//
//
//        int cantidad = consola.getEntero("Ingresa la Cantidad", 3);
//        double[][] coordenadas = consola.getCoordenadas(cantidad);
//
//        double numero = consola.getNumero("Ingresa el Valor de X");
//
//        consola.limpiarPantalla();
//
//        this.evaluar(coordenadas[0], coordenadas[1], numero);

    }
    
}
