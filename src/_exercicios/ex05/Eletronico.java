package _exercicios.ex05;

public class Eletronico extends Produto {

    // Metodo para calcular o imposto
    @Override
    public void imposto(double valor) {
        System.out.println("Desconto eletrônico: " + valor * 0.15);
    }
}
