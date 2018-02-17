/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hojadetrabajo4.Stack;
import hojadetrabajo4.StackArrayList;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
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
