/*
    Crie uma interface contendo os métodos:
        - Cadastrar;
        - Listar.

    Em seguida, crie uma classe chamada Pessoa que irá implementar a interface.
    Utilizando um ArrayList, implemente os métodos obrigatórios para armazenar nomes.
*/

package _exercicios.ex07;

import java.util.ArrayList;

public class Pessoa implements Padrao {

    // AraryList
    ArrayList<String> nomes = new ArrayList<>();

    // Metodos
    @Override
    public void cadastrar(String nome) {
        nomes.add(nome);
    }

    @Override
    public void listar() {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
