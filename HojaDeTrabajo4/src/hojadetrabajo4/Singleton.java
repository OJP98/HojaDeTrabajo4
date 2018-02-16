/**
 * Patron de diseno Singleton
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

package hojadetrabajo4;

public class Singleton {
   private static Singleton instance = null;
   protected Singleton() {
      // Exists only to defeat instantiation.
   }
   public static Singleton getInstance() {
      if(instance == null) {
         instance = new Singleton();
      }
      return instance;
      
   }
}