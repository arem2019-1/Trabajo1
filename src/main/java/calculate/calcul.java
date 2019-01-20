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
            //System.out.println("el numero  tomar es : "+(Double)i.next());
            suma+=(Double)i.next();
        };
        
    
        int total=datos.size();
        return suma/total;
    }
    
    public Double DesviaEstandar(LinkedList<Double> dat,Double media){
        int n=0;
        Double suma=0.0;
        Iterator ii=dat.descendingIterator();
        Double tmp=0.0;
        Double resp=0.0;
        Double f=0.0;
        while(ii.hasNext()){
            //System.out.println("el numero  tomar es : "+(Double)ii.next());
            tmp=(Double)ii.next()-media;
            //System.out.println("que suma "+Math.pow(tmp, 2));
            suma+=(Double)Math.pow(tmp, 2);
            //suma+=(Double)i.next();
            n++;
        };        
        resp=suma/(n-1);
        f=(Double)Math.sqrt(resp);
        return f;
    }
    public Double getDato(){
        return dato;
    
    }
    public void setDato(){
        this.dato=dato;
    
    }
}
