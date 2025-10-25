// Polimorfismo

package _exercicios.ex05;

public class Main {

    void main() {

        Produto p1 = new Produto();
        p1.imposto(1000);

        Produto p2 = new Vestuario(); // p2 é do tipo Produto, mas aponta para um objeto Vestuario
        p2.imposto(1000); // Executa o metodo da classe Vestuario

        Produto p3 = new Eletronico(); // p3 é do tipo Produto, mas aponta para um objeto Eletronico
        p3.imposto(1000); // Executa o metodo da classe Eletronico
    }
}

