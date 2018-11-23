
import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private String tempo;
    private String cpf;
    private String matricula;
    private String carteira;
    ArrayList<Funcionario> ListaFunc;
    
    public Funcionario(){
        ListaFunc = new ArrayList();
    }

    public Funcionario(String nome, String tempo, String cpf, String matricula, String carteira) {
        this.nome = nome;
        this.tempo = tempo;
        this.cpf = cpf;
        this.matricula = matricula;
        this.carteira = carteira;
        ListaFunc = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarteira() {
        return carteira;
    }

    public void setCarteira(String carteira) {
        this.carteira = carteira;
    }

    public ArrayList<Funcionario> getListaFunc() {
        return ListaFunc;
    }

    public void setListaFunc(ArrayList<Funcionario> ListaFunc) {
        this.ListaFunc = ListaFunc;
    }
    
    public void addFunc(Funcionario F){
        ListaFunc.add(F);
    }
}
