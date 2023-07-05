package exercicio3;

public class Main {
    public static void main(String[] args){
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[3];

        pessoas[0] = new Pessoa("pedro","masculino",21);
        pessoas[1] = new Pessoa("maria", "feminino",31);

        livros[0] = new Livro("baleia azul","Cleber",200,pessoas[1]);
        livros[1] = new Livro("menua do truco","marcinho",500,pessoas[0]);
        livros[2] = new Livro("poo","zé",300,pessoas[1]);

        livros[0].abrir();
        livros[0].folhear(20);
        System.out.println(livros[0].detalhes());

        System.out.println(livros[2].detalhes());
    }
}
