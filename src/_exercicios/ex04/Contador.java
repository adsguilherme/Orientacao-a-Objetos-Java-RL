/*
    Crie um sistema para trabalhar com um contador.
    Haverá um atributo público e estático incializando com zero.
    Também haverá dois métodos (public e static), um para incrementar e outro para decrementar.

    Exemplo:
        Contador.incrementar(); // +1
        Contador.incrementar(); // +1
        Contador.decrementar(); // -2
        System.out.println(Contador.contador); // Retorna 1
*/

package _exercicios.ex04;

public class Contador {

    // Atributo
    public static int contador = 0;

    // Metodo
    public static void incrementar() {
        contador++;
    }

    // Metodo
    public static void decrementar() {
        contador--;
    }



}
