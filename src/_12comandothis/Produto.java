package _12comandothis;

public class Produto {

    // Atributo
    private String nome = "Teclado";

    // Construtor
    public Produto(String nome) {
        System.out.println(nome); // referencia do parametro do construtor (linha 9)
        System.out.println(this.nome); // referencia do atributo da classe (linha 6)
    }
}
