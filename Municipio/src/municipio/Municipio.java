
package municipio;


import java.util.Scanner;

/**
 *
 * @author Emily Nascimento
 */
public class Municipio {

 
    public static void main(String[] args) {
       //atributos
        String nome;
        byte idade;
        double renda;
        char sexo;
        
        //objeto para leitura (entrada pelo terminal) de dados
        Scanner pegar = new Scanner(System.in);
        
        //Entrevistar pessoa 1 
        Pessoa pessoa1 = new Pessoa(); 
        System.out.println("Informe seu nome: ");
        pessoa1.nome = pegar.next();
        System.out.println("Informe sua idade: ");
        pessoa1.idade = pegar.nextByte();
        System.out.println("Informe sua renda: ");
        pessoa1.rendaFixa = pegar.nextDouble();
        System.out.println("Informe seu sexo: ");
        pessoa1.sexo = pegar.next().charAt(0);
        
        //Entrevistar pessoa 2
        Pessoa pessoa2 = new Pessoa(); 
        System.out.println("Informe seu nome: ");
        pessoa2.nome = pegar.next();
        System.out.println("Informe sua idade: ");
        pessoa2.idade = pegar.nextByte();
        System.out.println("Informe sua renda: ");
        pessoa2.rendaFixa = pegar.nextDouble();
        System.out.println("Informe seu sexo: ");
        pessoa2.sexo = pegar.next().charAt(0);
        
        //Entrevistar pessoa 1
        Pessoa pessoa3 = new Pessoa(); 
        System.out.println("Informe seu nome: ");
        pessoa3.nome = pegar.next();
        System.out.println("Informe sua idade: ");
        pessoa3.idade = pegar.nextByte();
        System.out.println("Informe sua renda: ");
        pessoa3.rendaFixa = pegar.nextDouble();
        System.out.println("Informe seu sexo: ");
        pessoa3.sexo = pegar.next().charAt(0);
        
        //Printando uma pessoa = posição de memoria
        System.out.println(pessoa1);
        
        //criando um vetor para salvar o objeto
        Pessoa[] listaPessoas = {pessoa1, pessoa2, pessoa3};
        
        //calculo de média das idades
        int totalIdade = 0, quantidade = 0;
        int[] numeros = {10, 20, 30};
        //for(int n : numeros){                //for int - para cada elemento
            for(Pessoa p : listaPessoas){
            totalIdade = totalIdade + p.idade;
            quantidade = quantidade + 1;
            }
            
            double mediaIdade = totalIdade / quantidade;
            System.out.println("A média das idades foram: "+mediaIdade);
            
            //overloading - (mesma coisa do overide mesmo metodo mas um contendo parametros e o outro não
            
        }
    
                

    
}
