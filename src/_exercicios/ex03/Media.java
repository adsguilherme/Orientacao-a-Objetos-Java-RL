/*
    Crie um sistema para calcular médias. Haverá três construtores:
        - public Media(double nota1, double nota2);
        - public Media(double nota1, double nota2, double nota3);
        - public Media(double nota1, double nota2, double nota3, double nota4);

    O construtor deverá realizar o cálculo e retornar uma mensagem com a média.
*/

package _exercicios.ex03;

public class Media {

    // Primeiro construtor
    public Media(double nota1, double nota2) {
        System.out.println("A média é: " + (nota1 + nota2) / 2);
    }

    // Segundo construtor
    public Media(double nota1, double nota2, double nota3) {
        System.out.println("A média é: " + (nota1 + nota2 + nota3) / 3);
    }

    // Terceiro construtor
    public Media(double nota1, double nota2, double nota3, double nota4) {
        System.out.println("A média é: " + (nota1 + nota2 + nota3 + nota4) / 4);
    }
}
