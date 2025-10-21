package _04_05_06_07conceitos;

public class Pessoa {

    // Atributos
    String nome;
    int idade;

    // Metodo de apresentação
    // Que não a retorno
    void apresentacao() {
        System.out.println("Olá " + nome + " você tem " + idade + " anos.");
    }

    // Metodo para retornar a situacao
    String situacaoIdade() {
        return idade >= 18 ? "Maior de idade" : "Menor de idade";
    }
}
