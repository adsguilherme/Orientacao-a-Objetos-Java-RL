package _14heranca02;

public class Pessoa {
    // Atributos
    protected String nome;
    protected int idade;

    // Construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Metodo
    protected void mensagemPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
