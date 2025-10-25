package _19interface;

public class Calculadora implements CalculadoraSimples, CalculadoraCientifica { // Interface permite o uso de herança múltipla (classe abstrata não permite).
    @Override
    public int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    @Override
    public int subtrair(int numero1, int numero2) {
        return numero1 - numero2;
    }

    @Override
    public double seno(int numero) {
        return 0;
    }
}
