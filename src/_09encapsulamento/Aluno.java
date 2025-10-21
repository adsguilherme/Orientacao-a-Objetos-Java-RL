package _09encapsulamento;

// Private: apenas a classe Aluno terá acesso aos atributos e métodos.

public class Aluno {

    // Atributos
    private double nota1;
    private double nota2;

    // Metodo de média
    private double media() {
        return (nota1 + nota2) / 2;
    }

    // Metodo de situação
    private String situacao() {
        return media() >= 7 ? "Aprovado" : "Reprovado";
    }

    // Metodo principal
    // Com esse metodo principal, nosso objeto terá acesso apenas a esse metodo.
    // Dessa forma, temos o encapsulamento dos atributos e metodos (private).
    public void principal(double n1, double n2) {
        nota1 = n1;
        nota2 = n2;

        System.out.println("A média do aluno é: " + media());
        System.out.println("A situação do aluno é: " + situacao());
    }
}
