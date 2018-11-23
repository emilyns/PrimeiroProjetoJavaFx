
package municipio;

/**
 *
 * @author Emily Nascimento
 */
public class Pessoa {
    //caracteristicas = variaveis = atributos
    String nome;
    byte idade;
    double rendaFixa;
    char sexo;
    
    //metodos
    public void rendaAnual(){
    double Resultado = this.rendaFixa * 12;
        System.out.println(Resultado);
    }
    
    
}
