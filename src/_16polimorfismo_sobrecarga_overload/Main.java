package _16polimorfismo_sobrecarga_overload;

public class Main {

    void main() {

        // Instanciar objeto
        Calculadora c = new Calculadora();

        // Utilizar o primeiro metodo
        System.out.println(c.somar(10, 20));

        // Utilizar o segundo metodo
        System.out.println(c.somar(10, 20, 30));
    }
}
