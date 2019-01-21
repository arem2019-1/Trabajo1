/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author 2098325
 */
public class main {
    private static Double media;
    private static Double desv;
    //private static ListaDinamica<Integer> numeros = new ListaDinamica<>();
    private static calcul calculos;
    private static LinkedList<Double> al=new LinkedList<Double>();  
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            //System.out.println(cadena);
            double doble = Double.parseDouble(cadena);
        }
        b.close();
        media(al);
        desviacionEstandar(al,media);
    }
    public static void media(LinkedList<Double> temp){
        media=0.0;
        calculos=new calcul();
        media=calculos.Media(temp);
        System.out.println("respuest a es"+media);
    
    }    
    public static void desviacionEstandar(LinkedList<Double> temp, Double media){
        desv=0.0;
        calculos=new calcul();
        desv=calculos.DesviaEstandar(temp,media);
        System.out.println("La desviacion estandar es "+desv);
    }    
    public static void main(String[] args) throws IOException{
        System.out.println("Hola");
        muestraContenido("/home/cesar/Escritorio/Arem/Trabajo1/prueba.txt");
    }
}
