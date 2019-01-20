
import calculate.calcul;
import java.util.LinkedList;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cesar
 */
public class testCalculate {

    private static LinkedList<Double> datos = new LinkedList<Double>();
    private calcul cal=new calcul();

    @Test
    public void prueba1() {
        datos.addLast(160.0);
        datos.addLast(591.0);
        datos.addLast(114.0);
        datos.addLast(229.0);
        datos.addLast(230.0);
        datos.addLast(270.0);
        datos.addLast(128.0);
        datos.addLast(1657.0);
        datos.addLast(624.0);
        datos.addLast(1503.0);
        Double media1=cal.Media(datos);
        Double desviacionEstadar1=cal.DesviaEstandar(datos, media1);
        datos.clear();
        //Valor de la media
        assertEquals(550.6,media1);
        //valor de la media
        assertEquals(572.0268447469149,desviacionEstadar1);
    }

    @Test
    public void prueba2() {
        datos.addLast(15.0);
        datos.addLast(69.9);
        datos.addLast(6.5);
        datos.addLast(22.4);
        datos.addLast(28.4);
        datos.addLast(65.9);
        datos.addLast(19.4);
        datos.addLast(198.7);
        datos.addLast(38.8);
        datos.addLast(138.2);
        Double media2=cal.Media(datos);
        Double desviacionEstadar2=cal.DesviaEstandar(datos, media2);
        datos.clear();
        //Valor de la media
        assertEquals(60.31999999999999,media2);
        //valor de la media
        assertEquals(62.25583060601187,desviacionEstadar2);        
        
        
    }

}
