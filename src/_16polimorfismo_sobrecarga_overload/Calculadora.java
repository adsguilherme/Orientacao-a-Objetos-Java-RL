// Polimorfismo: Significa várias formas.

package _16polimorfismo_sobrecarga_overload;

public class Calculadora {

    // Primeiro metodo
    public int somar(int n1, int n2) {
        return n1 + n2;
    }

    // Segundo metodo
    public int somar(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Temos 2 metodos com o mesmo nome, porém com retornos diferentes.
}