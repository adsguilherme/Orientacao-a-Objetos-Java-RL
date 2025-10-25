/** Herança
 *
 * - Quando uma classe tem acesso aos atribitos e métodos de outra classe.
 * - Assim,P essa classe herda as características da outra classe.
 *
 **/

package _14heranca02;

public class Main {

    void main() {

        // Criar/Instanciar o Objeto
        // Inicializando os atributos e executar os métodos.
        Colaborador c = new Colaborador("Guilherme", 39, 5000, "Desenvolvedor");
    }
}

/**
 *
 * Neste caso, pessoa é uma subclasse da classe colaborar. O que isso significa ? A classe Colaborar é pai da classe pessoa ?
 *
 * Olá! Analisando o código que você forneceu, a sua afirmação e pergunta estão invertidas em relação ao que o código realmente implementa.
 * Vamos esclarecer:
 *
 * 1. "Neste caso, pessoa é uma subclasse da classe colaborar. O que isso significa ?"
 * ◦ Correção: No código fornecido, a classe Colaborador é a subclasse (ou classe filha) da classe Pessoa. A classe Pessoa é a superclasse (ou classe pai).
 * ◦ O que significa: Isso significa que a classe Colaborador herda todos os atributos e métodos protected e public da classe Pessoa. Um Colaborador "é um tipo de" Pessoa. Ele possui todas as características de uma Pessoa (nome, idade) e adiciona suas próprias características específicas (salário, cargo).
 *
 * 2. "A classe Colaborar é pai da classe pessoa ?"
 * ◦ Correção: Não, a classe Colaborador não é a classe pai da classe Pessoa. Pelo contrário, a classe Pessoa é a classe pai da classe Colaborador.
 * ◦ A linha public class Colaborador extends Pessoa { em Colaborador.java indica claramente que Colaborador estende Pessoa, o que estabelece Pessoa como a superclasse e Colaborador como a subclasse.
 *
 * Em resumo, a relação de herança é a seguinte:
 * • Pessoa é a classe pai (superclasse).
 * • Colaborador é a classe filha (subclasse) de Pessoa.
 *
 * Isso permite que um objeto Colaborador tenha acesso aos atributos nome e idade e ao metodo mensagemPessoa() definidos na classe Pessoa, além de seus próprios atributos (salario, cargo) e método (mensagemColaborador()).
 *
 */