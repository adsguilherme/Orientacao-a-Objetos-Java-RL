package _exercicios.ex05;

public class Vestuario extends Produto {

    // Metodo para calcular o imposto
    @Override
    public void imposto(double valor) {
        System.out.println("Desconto vestuário: " + valor * 0.10);
    }
}
