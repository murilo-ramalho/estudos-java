package UEC;

public class Lutador {
    private String nome, nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    public void apresentar(){
        System.out.println("Lutador "+ getNome()+ ", nasceu em "+ getNacionalidade()+ ", " + getIdade()+
                " anos, " + getAltura()+ "m de Altura, Pesando "+ getPeso()+"kg");
        System.out.println("Ganhou: "+ getVitorias());
        System.out.println("Perdeu: "+ getDerrotas());
        System.out.println("Empatou: "+ getEmpates());
        System.out.println("\n");
    }
    public void status(){
        System.out.println("Lutador: "+ getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println(getVitorias()+ " vitorias");
        System.out.println(getDerrotas()+ " Derotas");
        System.out.println(getEmpates()+ " Empates");
        System.out.println("\n");
    }
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    public void perderLuta() {
        setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(peso);
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(float peso) {
        if (peso>52.2 && peso<=70.3) this.categoria = "LEVE";
        else if (peso<=83.9) this.categoria = "MEDIO";
        else if (peso<=120.2) this.categoria = "PESADO";
        else this.categoria = "invalido";
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
