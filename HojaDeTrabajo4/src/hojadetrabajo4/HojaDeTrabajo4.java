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
        int decision2;
        int decision3;
        double resultado = 0;
                
        //Linea de codigo que lee inmediatamente el archivo .txt        
        
        System.out.println("\nBienvenido a la calculadora!\n");
                
        while (power) {
            System.out.println("\n____________________________________");            
            System.out.println("Ingrese la accion que desea realizar:\n");  
            System.out.println("1. Imprimir la cadena de texto");
            System.out.println("2. Operar la cadena con una implementacion");
            System.out.println("3. Salir del programa\n");
            
            decision = teclado.nextInt();
            
            if (decision==1){
                
                calcu = new Calculo("");
                String postFix = calcu.leerArchivo("./cadenaPostfix.txt");
                System.out.println("La cadena a operar es: " + postFix);
                
            } else if (decision == 2) {
                
                System.out.println("\nIngrese la implementacion que desea utilizar:\n");   
                System.out.println("1. Lista");
                System.out.println("2. Vectores");
                System.out.println("3. ArrayList\n");
                
                decision = teclado.nextInt();        
                
                    if (decision == 1){
                        System.out.println("\nQue tipo de lista desea utilizar:");
                        System.out.println("1. Simplemente encadenada");
                        System.out.println("2. Doblemente encadenada");
                        System.out.println("3. Circular\n");
                        
                        decision = teclado.nextInt();
                        
                        if (decision == 1){
                            calcu = new Calculo("single");
                         } else if (decision==2) {
                             calcu = new Calculo("double");
                        } else if (decision==3) {
                            calcu = new Calculo("circular");
                        } else {
                            System.out.println("Opcion invalida");
                        }
                        
                    } else if (decision==2){
                        calcu = new Calculo("vector");
                        
                    } else if (decision==3) {
                        calcu = new Calculo("array");
                        
                    } else {
                        System.out.println("Opcion invalida");
                    }
                    
                
                
            } else if (decision == 3) {
                
                System.out.println("Saliendo del programa...");
                power = false;
                
            } else {
                System.out.println("Opcion invalida\n");
            }                                
        }
        
    }    
}
