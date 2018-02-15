/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo4;

/**
 *
 * @author paulb
 */
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