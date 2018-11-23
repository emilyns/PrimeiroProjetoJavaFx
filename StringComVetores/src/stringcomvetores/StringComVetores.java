
package stringcomvetores;

/**
 *
 * @author Emily Nascimento
 */
public class StringComVetores {

    
    public static void main(String[] args) {
        int ano =  2018;
        int v[] = {1, 2, 3};
        double[] numeros = new double [10];
        //
        System.out.println(v [1]);
        numeros[5] = 500;                                        //salvou 500 na posição 5
        System.out.println(numeros[5]);
         // index - indices
         //String - vetor de palavras
         
         String palavra = "Curso de Java";
         System.out.println(palavra.charAt(0));                  // posição 0 = C
         System.out.println(palavra.charAt(5));                  // posição 5 = em branco pois espaços em branco faz parte da contagem
         System.out.println(palavra.replace ('a', 'e'));         //replace: substituir a posição por letra (A por E) | troca de letras
         
         String palavra2 = palavra.replace (' ', '/');           // 0123456789101112
         System.out.println(palavra2);                           // CURSO DE JAVA
         
         System.out.println(palavra2.substring (0, 5));          //substring - pega o inicio da letra até o final
         System.out.println(palavra2.substring (9));             //substring - pega o inicio da letra até o final
         System.out.println(palavra2.toUpperCase());             //toUpperCase - deixa as letras em maiusculas
         System.out.println(palavra2.toLowerCase());             //toLowerCase - deixa as letras em minusculas
         
         System.out.println(palavra+palavra2);
         
         //Imprimindo vetores
         
          for(int i=0; i<v.length; i++){                          //length - pega o tamanho do vetor
          System.out.println(v[i]);
          
          }                     
          for(int j=0; j<palavra.length(); j++) {
              System.out.println(palavra.charAt (j));
              
          }
         
         
         
         
         
         
        
         
         
    }
    
}
