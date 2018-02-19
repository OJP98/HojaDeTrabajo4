package hojadetrabajo4;

/**
 * Clase que implementa los metodos que se utilizan para realizar las operaciones
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

import java.io.*;

public class Calculo {
     Stack<Double> a;
     private boolean instance = true;
     /**
     *Constructor de la clase
     * POST: Construye una nueva Calculadora
     */
    public Calculo(String decision){               
        if (instance) {
            instance = false;
            a = StackFactory.usarFactory(decision);        
        }
                
    }

    /** Método para operar expresiones en postfix
     * POST: el resultado de la operacion que se paso como parametro
     * @param expresion escrita en postfix
     * @return el resultado de la operacion
     */
 public double operar(String expresion){
        double num2;
        double num1;
        String s = expresion.replaceAll("\\s","");
        int i =0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                a.push((double)Character.getNumericValue(s.charAt(i)));
            } else {
                if (a.size() > 1) {
                    num2 = a.pop();
                    num1 = a.pop();
                    switch (s.charAt(i)){
                        case '+': 
                            a.push(num1 + num2); 
                        break;
                        case '-': 
                            a.push(num1 - num2); 
                        break;
                        case '/': 
                            if (num2 == 0){
                                i = s.length();
                                a.push( Double.NaN);     
                            } else 
                                a.push(num1 / num2); 
                        break;
                        case '*': 
                            a.push(num1 * num2); 
                        break;
                        default:
                            i = s.length();
                            a.push( Double.NaN);
                        break;
                    }
                } else {
                    i = s.length();
                    a.push( Double.NaN);
                }
            }
            i++;
        }
        return a.pop(); 
    }
    
    /**
     * Metodo que permite que se abra el archivo txt que contiene la cadena.
     * @param cadena: la ubicacion del archivo txt
     * @return: La cadena postfix como un string
     */
    public String leerArchivo(String cadena) {
                        
        File f;
        FileReader fr;
        BufferedReader br;

        String postFix = "";

       //Este bloque de codigo tiene como objetivo leer la cadena de texto que
       //el usuario haya establecido previamente
        try {

            f = new File (cadena);            
            fr = new FileReader(f);
            br = new BufferedReader(fr);      
            
            String linea;

            while( (linea = br.readLine()) != null) {
                postFix += linea;
            }                                            
            
            br.close();
            fr.close();

        }
        //Si el archivo se modifica manualmente o sucede cualquier otros tipo de
        //error, este sera comunicado con el usuario
        catch (Exception e) {

            System.err.println("Se produjo un error: " + e);                 

        }                

        return postFix;

    }
}


