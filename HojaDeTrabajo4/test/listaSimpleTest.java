/**
 * Prueba unitaria que realiza tests de la clase lista simple y sus metodos
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

import hojadetrabajo4.*;
import hojadetrabajo4.SinglyLinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

public class listaSimpleTest {
    
    List a = new SinglyLinkedList();
    
    @Test
    public void AddGetTest(){
        
        int resultado = 14;
        
        a.addLast(12);                       
        a.addLast(13);                       
        a.addLast(resultado);                       
        
        int respuesta = (int) a.getLast();
        
        assertEquals(resultado, respuesta, 0);
    }
    
    @Test
    public void sizeRemoveTest(){
    
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(4);
        a.addLast(5);
        
        a.removeLast();
        
        int resultado = a.size();    
       
        assertEquals(4, resultado, 0);
        assertEquals(4, (int)a.removeLast(), 0);
        
    }
    
    @Test
    public void clearTest(){
        
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(4);
        a.addLast(5);
        
        a.clear();
        
        int resultado = a.size();    
        assertEquals(resultado, 0, 0);        
    }
    
    
    
    
}
