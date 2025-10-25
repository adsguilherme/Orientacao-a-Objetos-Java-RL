package _17polimorfismo_sobrescrita_override;

public class DescontoIRPadrao {

    // Imposto de renda
    public double impostoRenda(double salario) {
        return salario * 0.10;
    }

    // Vale transporte
    public double valeTransporte(double salario) {
        return salario * 0.06;
    }
}
