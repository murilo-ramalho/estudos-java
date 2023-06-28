package exercicio1;

public class ContaPoupanca {
    private String nome;
    private String cpf;
    private String cidade;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ContaPoupanca(String nome, String cpf, String cidade, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.cidade = cidade;
        this.senha = senha;
        status();
    }
    public void status(){
        System.out.println("seu nome: "+getNome());
        System.out.println("seu cpf: "+getCpf());
        System.out.println("sua cidade:"+getCidade());
    }
}
