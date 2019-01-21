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
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author 2098325
 */
public class main {
    private static Double media;
    private static Double desv;
    private static calcul calculos;
    private static LinkedList<Double> col1=new LinkedList<Double>();  
    private static LinkedList<Double> col2=new LinkedList<Double>();  
    
    /**
     * 
     * @param args Para iniciar la aplicacion.
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException{
        muestraContenido();
        System.out.println("table 1:");
        media(col1);
        desviacionEstandar(col1, media);
        System.out.println("table 2:");
        media(col2);
        desviacionEstandar(col2, media);        
    }    
    /**
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void muestraContenido() throws FileNotFoundException, IOException {
    try {
        Path filePath = Paths.get("src/main/java/calculate/prueba.txt");
        Scanner scanner = new Scanner(filePath);
        
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    //System.out.println(""+scanner.nextDouble());
                    //System.out.println(""+scanner.nextDouble());
                    col1.addFirst(scanner.nextDouble());
                    col2.addFirst(scanner.nextDouble());
                } else {
                    scanner.next();
                } 
            }
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    /**
     * 
     * @param temp Es la lista enlazada con los datos a procesar
     */
    public static void media(LinkedList<Double> temp){
        media=0.0;
        calculos=new calcul();
        media=calculos.Media(temp);
        System.out.println("La media es: "+String.format("%.2f", media));
    
    }  
    /**
     * 
     * @param temp Es la lista enlazada con los datos a procesar 
     * @param media Es la constante del valor de media.
     */
    public static void desviacionEstandar(LinkedList<Double> temp, Double media){
        desv=0.0;
        calculos=new calcul();
        desv=calculos.DesviaEstandar(temp,media);
        System.out.println("La desviacion estandar es "+String.format("%.2f", desv));
    }    

}
