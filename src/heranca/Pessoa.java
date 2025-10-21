package heranca;

public class Pessoa {
    // Atributos
    protected String nome;
    protected int idade;

    // Metodo
    protected void mensagemPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
