/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author 2098325
 */
public class calcul {

    public calcul(){

    }
/**
    * <p>Sirve para obtener la media.</p> * 
 * @param datos Los datos que seran procesados, y se recibe una lista enlazada
 * @return  Un dato en formato DOuble.
 */
    public Double Media(LinkedList<Double>datos){
        Double suma=0.0;
        Iterator i=datos.descendingIterator();
        while(i.hasNext()){
            suma+=(Double)i.next();
        };
        int total=datos.size();
        return suma/total;
    }
/**
     * <p>Sirve para obtener la Desviacion Estandar.</p>

 * @param dat Es una lista enlazada en la cual vienen los datos para ser procesados.
 * @param media Es una constante Double que sirve para obtener la desviacion.
 * @return  f Que es el valor despues de procesar los datos.
 */    
    public Double DesviaEstandar(LinkedList<Double> dat,Double media){
        int n=0;
        Double suma=0.0;
        Iterator ii=dat.descendingIterator();
        Double tmp=0.0;
        Double resp=0.0;
        Double f=0.0;
        while(ii.hasNext()){
            tmp=(Double)ii.next()-media;
            suma+=(Double)Math.pow(tmp, 2);
            n++;
        };        
        resp=suma/(n-1);
        f=(Double)Math.sqrt(resp);
        return f;
    }
}
