/*
    O usuário informa um número, em seguida retorne:
    - Se é par ou ímpar;
    - Se é positivo ou negativo;

    Dicas:
    - Separe em dois métodos de verificação;
    - Implemente o construtor ou utilize get/set;
    - Deixe os atributos e métodos privados.
 */

package _exercicios.ex01;

public class Numero {

    // Atributo
    private int numero;

    // Metodo para verificar se é par ou ímpar
    private void parOuImpar() {
        System.out.println(numero % 2 == 0 ? "O número é par" : "O número é ímpar");
    }

    // Metodo para verificar se é positivo ou negativo
    private void positivoOuNegativo() {
        System.out.println(numero >= 0 ? "O número é positivo" : "O número é negativo");
    }

    // Construtor
    public Numero(int numero) {
        this.numero = numero;

        parOuImpar();
        positivoOuNegativo();
    }
}
