
package mundo;

/**
 *
 * @author Emily Nascimento
 */
public class Mundo {

    
    public static void main(String[] args) {
       Pessoa p1 = new Pessoa();        //instanciar = criar objeto
       Pessoa p2 = new Pessoa();
       
       p1.nome = "Eva";
       p2.nome = "Adão";
       p1.andar();
       p2.comer();
       
       Baby b1 = new Baby("Lucas", 'M');
       b1.andar();
       
       
    }
    
}
