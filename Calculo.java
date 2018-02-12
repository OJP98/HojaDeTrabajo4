package tarea.algoritmos.pkg2;
/**
 * @author Paul Belches
 * @author Mario Sarmientos 
 * @since 30/01/18
 */
public class Calculo implements Calculadora {

     /**
     *Constructor de la clase
     * POST: Construye una nueva Calculadora
     */
    public Calculo(){
    }

    /** Método para operar expresiones en postfix
     * POST: el resultado de la operacion que se paso como parametro
     * @param expresion escrita en postfix
     * @return el resultado de la operacion
     */
    public double operar(String expresion){
        Stack<Double> a = new StackVector();
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
}
