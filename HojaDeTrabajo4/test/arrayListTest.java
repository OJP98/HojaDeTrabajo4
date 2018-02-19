/**
 * Prueba unitaria que realiza tests de la clase array list y sus metodos
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

import hojadetrabajo4.Stack;
import hojadetrabajo4.StackArrayList;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class arrayListTest {
    
    Stack stack = new StackArrayList<>();
        
    public arrayListTest() {
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
    }
    
    @Test
    public void PushPeekTest(){
        
        stack.push(50);
        
        int resultado = (int) stack.peek();
        
        assertEquals(50,resultado);
        
    }
    
    @Test
    public void PopSizeTest(){
        
        stack.pop();
        
        int resultado = stack.size();
        
        assertEquals(4,resultado);
    }
    
    @Test public void empty(){
        
        boolean respuesta = stack.empty();
        
        assertEquals(false,respuesta);
        
    }
    
    
    
}
