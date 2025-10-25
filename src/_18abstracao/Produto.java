package _18abstracao;

public class Produto extends Crud  {

    @Override
    public void cadastrar() {
        System.out.println("Produto cadastrado com sucesso!");
    }

    @Override
    public void selecionar() {
        System.out.println("Produto selecionado com sucesso!");
    }

    @Override
    public void alterar() {
        System.out.println("Produto alterado com sucesso!");
    }

    @Override
    public void remover() {
        System.out.println("Produto removido com sucesso!");
    }
}
