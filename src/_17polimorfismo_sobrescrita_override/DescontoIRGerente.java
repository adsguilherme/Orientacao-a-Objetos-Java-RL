package _17polimorfismo_sobrescrita_override;

public class DescontoIRGerente extends DescontoIRPadrao {

    // Imposto de renda
    @Override
    public double impostoRenda(double salario) {
        return salario * 0.15;
    }
}
