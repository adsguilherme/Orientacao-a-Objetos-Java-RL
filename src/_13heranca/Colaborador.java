package _13heranca;

// 'extends Pessoa' faz com que a classe Colaborar tenha acesso aos atributos e métodos da classe Pessoa.
public class Colaborador extends Pessoa {

    // Atributos
    private String cargo;
    private double salario;

    // Metodo
    public void mensagemColaborador(){
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

    // Construtor
    public Colaborador(String nome, int idade, double salario, String cargo){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;

        mensagemPessoa();
        mensagemColaborador();
    }
}
