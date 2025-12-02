package testepoupanca;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 * @version 1.0
 */
public class ContaDePoupanca {
    private static double taxaDeJurosAnual = 0.07;
    private double saldoDaPoupanca;
    private double rendimento;

    public ContaDePoupanca(double saldoDaPoupanca) {
        this.saldoDaPoupanca = saldoDaPoupanca;
    }
    
    public void rendimentoMensal(){
        this.setRendimento((this.saldoDaPoupanca*this.taxaDeJurosAnual)/12);
        this.saldoDaPoupanca+=this.rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public static double getTaxaDeJurosAnual() {
        return taxaDeJurosAnual;
    }

    public static void setTaxaDeJurosAnual(double taxaDeJurosAnual) {
        ContaDePoupanca.taxaDeJurosAnual = taxaDeJurosAnual;
    }
    
    public void imprimirSaldo(){
        System.out.println("O rendimento deste poupador neste mês é " + this.getRendimento() + ".");
        System.out.println("O saldo total é " + this.saldoDaPoupanca);
    }
}
