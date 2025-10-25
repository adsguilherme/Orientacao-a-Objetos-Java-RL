package _18abstracao;

/**
 * Classe Abstrata é um modelo para que outras classes sigam o mesmo padrão.
 * Uma Classe Abstrata não pode ser instanciada ou seja não podemos criar objetos dessa classe.
 */

public abstract class Crud {

    // Metodos obrigatórios

    public abstract void cadastrar();
    public abstract void selecionar();
    public abstract void alterar();
    public abstract void remover();

    // Metodos opcionais

    public void mensagem() {
        System.out.println("Método opcional...");
    }

}
