/*
    Crie uma classe abstrata com o metodo verificarDesconto.
    O usuário informa a forma de pagamento (à vista ou a prazo) e o total da compra.
    Caso o pagamento seja à vista e o valor mínimo de R$100,00, será fornecido 10% de desconto.
*/

package _exercicios.ex06;

public class Loja extends Pagamento {

    @Override
    public void verificarDesconto(String formaPagamento, double totalCompra) {
        if (formaPagamento.equals("à vista") && totalCompra >= 100.00) {
            double desconto = totalCompra * 0.10;
            System.out.println("Desconto de 10% aplicado! Valor do desconto: R$ " + desconto);
            System.out.println("Valor final da compra: R$ " + (totalCompra - desconto));
        } else {
            System.out.println("Nenhum desconto aplicável para esta forma de pagamento ou valor de compra.");
            System.out.println("Valor final da compra: R$" + totalCompra);
        }
    }
}
