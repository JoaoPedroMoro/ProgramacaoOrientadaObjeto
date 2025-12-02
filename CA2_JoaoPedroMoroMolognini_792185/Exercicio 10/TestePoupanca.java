package testepoupanca;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 * @version 1.0
 */
public class TestePoupanca {
    public static void main(String[] args) {
        ContaDePoupanca poupador1 =  new ContaDePoupanca(2000);
        ContaDePoupanca poupador2 = new ContaDePoupanca(3000);
        poupador1.setTaxaDeJurosAnual(0.06);
        poupador1.rendimentoMensal();
        poupador2.rendimentoMensal();
        poupador1.imprimirSaldo();
        poupador2.imprimirSaldo();
        
        poupador2.setTaxaDeJurosAnual(0.08);
        poupador1.rendimentoMensal();
        poupador2.rendimentoMensal();
        poupador1.imprimirSaldo();
        poupador2.imprimirSaldo();
    }
    
}
