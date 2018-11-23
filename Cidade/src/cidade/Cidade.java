
package cidade;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Emily Nascimento
 */
public class Cidade {

    public static void main(String[] args) {
    Pessoa p1 = new Pessoa();                  //new Pessoa = responsavel pela criação do novo objeto (método construtor)
    Pessoa p2 = new Pessoa();
    Pessoa p3 = new Pessoa();
    Pessoa p4 = new Pessoa();
    p1.nome = "Patricia";
    p1.idade = 47;
    p1.altura = 1.50f;
    p1.sexo = 'F';
                System.out.println("Os dados da pessoa 1 foram: " +
                                   "\n Nome: "+p1.nome+                //atribuição
                                   "\n Idade: "+p1.idade+
                                   "\n Altura: "+p1.altura+
                                   "\n Sexo: "+p1.sexo);
                
    
    p2.nome = "Wagner";
    p2.idade = 49;        
    p2.altura = 1.75f;             //quando usar double/float = setando valor (usar ponto), scanner (virgula), JOptionpane (ponto)
    p2.sexo = 'M';
                System.out.println("Os dados da pessoa 2 foram: " +
                                   "\n Nome: "+p2.nome+
                                   "\n Idade: "+p2.idade+
                                   "\n Altura: "+p2.altura+
                                   "\n Sexo: "+p2.sexo);
                
               
                //Entrada de dados com JOPtionPane (sobrescrever o valor da variavel)
    p4.nome = JOptionPane.showInputDialog(null, "Digite seu nome: ",            //mensagem
                                                "\n Informações",               //titulo
                                                JOptionPane.DEFAULT_OPTION);    //icone 
    
    String dataTemp = JOptionPane.showInputDialog(null, "Digite sua idade: ",    
                                                "\n Informações",               
                                                JOptionPane.DEFAULT_OPTION);     
    p4.idade = Byte.parseByte(dataTemp);                                        //converter o texto para byte
    dataTemp = JOptionPane.showInputDialog(null, "Digite sua altura: ",          
                                                "\n Informações",               
                                                JOptionPane.DEFAULT_OPTION);    
    p4.altura = Float.parseFloat(dataTemp);                                     //converter o texto para float
    dataTemp = JOptionPane.showInputDialog(null, "Digite seu sexo: ",         
                                                "\n Informações",               
                                                JOptionPane.DEFAULT_OPTION);    
    p4.sexo = dataTemp.charAt(0);
    
        JOptionPane.showMessageDialog(null,
                     "Os dados da pessoa 3 foram: " +
                     "\n Nome: "+p3.nome+
                     "\n Idade: "+p3.idade+
                     "\n Altura: "+p3.altura+
                     "\n Sexo: "+p3.sexo,
                     "Resultado",
                     JOptionPane.INFORMATION_MESSAGE);
        
 
                 //Entrada de dados com Scanner
    Scanner ler = new Scanner (System.in);
    System.out.println("Informe seu nome: ");
    p3.nome = ler.nextLine();
    System.out.println("Informe sua idade: ");
    p3.idade = ler.nextByte();
    System.out.println("Informe sua altura: ");
    p3.altura = ler.nextFloat();
    System.out.println("Informe seu sexo: ");
    p3.sexo = ler.next().charAt(0);               //char = caractere | At = na | charAt = pegar caractere na posição (o);
    
  
    
    
    
                
                
    
        
    }
    
}
