package AulaJava_3.TM_1;

public class Pessoa implements Precedente<Pessoa>{
    private String nome;
    private String CPF;

    public Pessoa(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public Boolean precedenteA(Pessoa pessoa) {
        if (this.nome.compareTo(pessoa.getNome()) < 0){
            return true;
        }
        return false;
    }
}
