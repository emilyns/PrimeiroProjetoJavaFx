
package mundo;

/**
 *
 * @author Emily Nascimento
 */
public class Baby extends Pessoa {
   short meses;                            //variaveis globais
   
   public Baby(String nome, char sexo){    //criação metodo contrutor - variavel locais
   this.nome = nome;
   this.sexo = sexo;
           
   }
   
   
    @Override        //reescrever uma função que já existe em outra classe
   
    public void andar(){
        System.out.println(nome+ " está engatinhando!");
        
        
    
}
    
}
