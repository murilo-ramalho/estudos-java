package exercicio3;

public class Livro implements Publicacao{
    private String titulo, autor;
    private int paginas, paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro" +
                "\ntitulo='" + titulo + '\'' +
                "\n, autor='" + autor + '\'' +
                "\n, paginas=" + paginas +
                "\n, paginaAtual=" + paginaAtual +
                "\n, aberto=" + aberto +
                "\n, leitor=" + leitor.getNome();
    }

    @Override
    public void abrir() {
        if (isAberto()) System.out.println("o livro já está aberto");
        else setAberto(true);
    }

    @Override
    public void fechar() {
        if (isAberto()) System.out.println("o livro já está fechado");
        else setAberto(true);
    }

    @Override
    public void folhear(int pag) {
        if (getPaginas()>pag) System.out.println("pagina inexistente");
        else setPaginaAtual(pag);
    }

    @Override
    public void avancarPag() {
        if (getPaginaAtual()>getPaginas()) System.out.println("o livro chegou ao fim");
        else setPaginaAtual(getPaginas()+1);
    }

    @Override
    public void voltarPag() {
        if (getPaginaAtual()==0) System.out.println("o livro está na primeira pagina");
        else setPaginaAtual(getPaginaAtual()-1);
    }

    public Livro(String titulo, String autor, int paginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        setPaginaAtual(0);
        setAberto(false);
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
