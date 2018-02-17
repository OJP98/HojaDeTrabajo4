/**
 * Prueba unitaria que realiza un test de la clase Calculo; esto lo hace al
 * realizar operaciones con cadenas de texto.
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

import hojadetrabajo4.Calculo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class calculoTest {        
    
    public calculoTest() {
    }       
    
    @Test
    /**
     * Metodo que tiene como tarea operar la cadena de texto ingresada por el usuario.     
     */
    public void operarListaCircularTest(){
        
        Calculo calcu = new Calculo("circular");
        
        String expresion = "3 2 + 2 - 5 * 2 + 4 / 3 * 5 - 2 /";
        double respuesta = 3.875;
        
        double resultado = calcu.operar(expresion);
        
        assertEquals(respuesta,resultado, 0.9);
        
    }
    
    
}
