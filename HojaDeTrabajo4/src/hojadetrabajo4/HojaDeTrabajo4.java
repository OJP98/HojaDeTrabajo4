/**
 * Clase principal que se comunica con el usuario.
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */
package hojadetrabajo4;
import java.util.Scanner;

public class HojaDeTrabajo4 {

    public static void main(String[] args) {
        
        Calculo calcu;
        boolean power = true;  
        Scanner teclado = new Scanner(System.in);
                        
        int decision;
        double resultado;
                
        //Linea de codigo que lee inmediatamente el archivo .txt
            calcu = new Calculo("");
            String postFix = calcu.leerArchivo("./cadenaPostfix.txt");        
        
        System.out.println("\nBienvenido a la calculadora!\n");
                
        while (power) {
            System.out.println("\n____________________________________");            
            System.out.println("Ingrese la accion que desea realizar:\n");  
            System.out.println("1. Imprimir la cadena de texto");
            System.out.println("2. Operar la cadena con una implementacion");
            System.out.println("3. Salir del programa\n");
            
            decision = teclado.nextInt();
            
            if (decision==1){
                                
                System.out.println("La cadena a operar es: " + postFix);
                
            } else if (decision == 2) {
                
                System.out.println("\nIngrese la implementacion que desea utilizar:\n");   
                System.out.println("1. Lista");
                System.out.println("2. Vectores");
                System.out.println("3. ArrayList\n");
                
                decision = teclado.nextInt();    
                String parametro="";
                
                    if (decision == 1){
                        System.out.println("\nQue tipo de lista desea utilizar:");
                        System.out.println("1. Simplemente encadenada");
                        System.out.println("2. Doblemente encadenada");
                        System.out.println("3. Circular\n");
                        
                        decision = teclado.nextInt();
                        
                        if (decision == 1){
                            parametro = "single";
                         } else if (decision==2) {
                             parametro = "double";
                        } else if (decision==3) {
                            parametro = "circular";
                        } else {
                            System.out.println("Opcion invalida");
                        }
                        
                    } else if (decision==2){
                        parametro = "vector";
                        
                    } else if (decision==3) {
                        parametro = "array";
                        
                    } else {
                        System.out.println("Opcion invalida");
                    }
                    
                    calcu = new Calculo(parametro);                   
                    resultado = calcu.operar(postFix);
                    System.out.println("El total es de: " + resultado);
                                    
            } else if (decision == 3) {
                
                System.out.println("Saliendo del programa...");
                power = false;
                
            } else {
                System.out.println("Opcion invalida\n");
            }                                
        }
        
    }    
}
