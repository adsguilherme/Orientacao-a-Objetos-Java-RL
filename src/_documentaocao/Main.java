package _documentaocao;

/**
 * Classe principal.
 *
 * @author Guilherme Sousa
 * @version 1.0
 */
public class Main {

    /**
     * Metodo principal.
     */
    void main() {
        // Criar objeto
        Pessoa pessoa = new Pessoa("Guilherme", 39);

        // Método de apresentação
        pessoa.apresentacao();

        // Exibir a situação da idade
        System.out.println(pessoa.verificarIdade());
    }
}

