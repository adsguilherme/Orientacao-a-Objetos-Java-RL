package _17polimorfismo_sobrescrita_override;

public class Main {

    void main() {

        // Instanciar objeto da classe padrão
        DescontoIRPadrao objPadrao = new DescontoIRPadrao();
        System.out.println("Vale transporte: " + objPadrao.valeTransporte(1000));
        System.out.println("Imposto de renda: " + objPadrao.impostoRenda(1000));

        // Instanciar objeto da classe Dev
        DescontoIRDev objDev = new DescontoIRDev();
        System.out.println("Imposto de renda Dev: " + objDev.impostoRenda(1000));

        // Instanciar objeto da classe Gerente
        DescontoIRGerente objGerente = new DescontoIRGerente();
        System.out.println("Imposto de renda Gerente: " + objGerente.impostoRenda(1000));
    }
}
