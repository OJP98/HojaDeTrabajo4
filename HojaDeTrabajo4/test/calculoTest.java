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
     * Metodo que tiene como tarea operar la cadena de texto ingresada por el usuario con la implementacion vector.     
     */
    public void operarListaVectorTest(){
        
        Calculo calcu = new Calculo("vector");
        
        String expresion = "3 2 + 2 - 5 * 2 + 4 / 3 * 5 - 2 /";
        double respuesta = 3.875;
        
        double resultado = calcu.operar(expresion);
        
        assertEquals(respuesta,resultado, 0.9);
        
    }
    
    /**
     * Metodo que tiene como tarea operar la cadena de texto ingresada por el usuario con la implementacion arralist.     
     */
    @Test    
    public void operarListaArrayTest(){
        
        Calculo calcu = new Calculo("array");
        
        String expresion = "3 2 + 2 - 5 * 2 + 4 / 3 * 5 - 2 /";
        double respuesta = 3.875;
        
        double resultado = calcu.operar(expresion);
        
        assertEquals(respuesta,resultado, 0.9);
        
    }
    
    /**
     * Metodo que tiene como tarea operar la cadena de texto ingresada por el usuario con la implementacion lista doble.     
     */
    @Test
    public void operarListaDoubleTest(){
        
        Calculo calcu = new Calculo("double");
        
        String expresion = "3 2 + 2 - 5 * 2 + 4 / 3 * 5 - 2 /";
        double respuesta = 3.875;
        
        double resultado = calcu.operar(expresion);
        
        assertEquals(respuesta,resultado, 0.9);
        
    }
    
    /**
     * Metodo que tiene como tarea operar la cadena de texto ingresada por el usuario con la implementacion lista simple.     
     */
    @Test
    public void operarListaSingleTest(){
        
        Calculo calcu = new Calculo("single");
        
        String expresion = "3 2 + 2 - 5 * 2 + 4 / 3 * 5 - 2 /";
        double respuesta = 3.875;
        
        double resultado = calcu.operar(expresion);
        
        assertEquals(respuesta,resultado, 0.9);
        
    } 
    
    /**
     * Metodo que tiene como tarea operar la cadena de texto ingresada por el usuario con la implementacion lista circular.     
     */
    @Test
    public void operarListaCircularTest(){
        
        Calculo calcu = new Calculo("circular");
        
        String expresion = "3 2 + 2 - 5 * 2 + 4 / 3 * 5 - 2 /";
        double respuesta = 3.875;
        
        double resultado = calcu.operar(expresion);
        
        assertEquals(respuesta,resultado, 0.9);
        
    }
    
    
}
