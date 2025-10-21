package _04_05_06_07conceitos;

public class Main {

    void main() {

        // Criar ou Instanciar objeto da classe Pessoa
        Pessoa p = new Pessoa();

        // O objeto p tem acesso aos atributos e métodos da classe Pessoa
        p.nome = "Guilherme";
        p.idade = 39;

        p.apresentacao();

        //String situacao = p.situacaoIdade();
        //System.out.println("A situação da idade é: " + situacao);

        // Fiz a chamada direta do metodo sem criar uma variável
        System.out.println("A situação da idade é: " + p.situacaoIdade());


    }
}
