public class Aluno {
    private String nome;
    private Integer idade;

    public Aluno(String nome, Integer idade){
        this.nome = nome;
        try {
            this.idade = idade;
        } catch (idadeException e){
            System.out.println("0 aluno " + nome + "ainda é menor de idade");
            System.out.println(e.getMessage());
        }

    }

    public void setIdade(Integer idade) throws idadeException {
        this.idade = (idade < 18)? throw new idadeException(""): idade;
        if (idade < 18) {
            throw new idadeException("");
        } else {
            this.idade = idade;
        }
    }
}

class idadeException extends Exception{
    idadeException(String message){
        super(message);
    }
}