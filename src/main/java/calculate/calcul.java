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
    private  LinkedList<Double> respuesta=new LinkedList<Double>(); 
    private Double dato;
    public calcul(){

    }
    public Double Media(LinkedList<Double>datos){
        Double suma=0.0;
        Iterator i=datos.descendingIterator();
        while(i.hasNext()){
            suma+=(Double)i.next();
        };
    
        int total=datos.size();
        return suma/total;
    }
    
    public Double DesviaEstandar(LinkedList<Double> datos,Double media){
        Double suma=0.0;
        Iterator i=datos.descendingIterator();
        Double tmp=0.0;
        while(i.hasNext()){
            tmp=(Double)i.next()-media;
            suma+=(Double)Math.pow(tmp, 2);
            //suma+=(Double)i.next();
        };        
        return suma;
    }
    public Double getDato(){
        return dato;
    
    }
    public void setDato(){
        this.dato=dato;
    
    }
}
