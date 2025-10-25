/*
    Haverá três classes, sendo elas:
        - Produto com o metodo imposto() com uma aliquota de 5%;
        - Vestuario com o metodo imposto() com uma aliquota de 10%;
        - Eletronico com o metodo imposto() com uma aliquota de 15%;

    Esses métodos deverão exibir uma mensagem com o total de imposto a ser pago.
*/

package _exercicios.ex05;

public class Produto {

    // Metodo para calcular o imposto
    public void imposto(double valor) {
        System.out.println("Desconto padrão: " + valor * 0.05);
    }

}
