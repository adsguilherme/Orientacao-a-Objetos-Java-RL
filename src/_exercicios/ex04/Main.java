package _exercicios.ex04;

public class Main {

    void main() {

        // Contador inicializa em zero (valor atribuído na classe Contador)

        System.out.println(Contador.contador); // Retorna zero

        Contador.incrementar(); // 0 + 1 = 1
        Contador.incrementar(); // 1 + 1 = 2
        Contador.decrementar(); // 2 - 1 = 1

        System.out.println(Contador.contador); // Retorna 1
    }
}
