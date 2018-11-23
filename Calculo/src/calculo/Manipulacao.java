
package calculo;

/**
 *
 * @author Emily Nascimento
 */
public class Manipulacao {
    //selecionar + ctrl + barra de espaço (comentar varias linhas)
    
     static double resultado;
    
    public static double adição (double x1, double x2){
     resultado = x1+x2;
     return resultado;
       
        }
    
    public static void subtração (double x1, double x2){
    resultado = x1-x2;
        System.out.println("O resultado da subtração é: "+resultado);
        }
    
    public static void multiplicação (double x1, double x2){
    resultado = x1*x2;
        System.out.println("O resultado da multiplicação é: "+resultado);
        }
    
    public static void divisão (double x1, double x2){
    
        if (x2 != 0 ){
            System.out.println("O resultado da divisão é:"+resultado);
          
        } else {
            resultado = x1/x2;
            System.out.println("ERROR");
        }
        
        
        }
    
    
    
    
    
}
