
package calculo;

import java.util.Scanner;

/**
 *
 * @author Emily Nascimento
 */
public class Calculo {

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        double x1 = ler.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        double x2 = ler.nextDouble();
        
        System.out.println("Digite: \n"
                    +" + para somar \n"
                   +"- para subtrair\n"
                  +"* para multiplicar\n"
                  +"/ para dividir\n");
        
        char caracter = ler.next().charAt(0);
        
        
        switch(caracter){
            
            case '+':
                double r = (Manipulacao.adição(x1, x2));
                System.out.println("O resultado da adição é: "+r);
                break;
            case '-':
                Manipulacao.subtração(x1, x2);
                break;
            case '/':  
                Manipulacao.divisão(x1, x2);
                break;
            case '*':  
                Manipulacao.multiplicação(x1, x2);
                break;
                
            default:
                System.out.println("Por favor, digite um caracter válido");
        
        }
        
       
                
           
        }
        
        
       
     
       
      
       
        
        
    
    
}
