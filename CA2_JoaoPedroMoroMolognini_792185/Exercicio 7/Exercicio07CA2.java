package exercicio07.ca2;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 * @version 1.0
 */
public class Exercicio07CA2 {
    /**
    *   Deve-se utilizar os conceito de encapsulamento e polimorfismo para a construção da classe Mensagem.
    *   Uma situação real para utilização dessa classe seria quando se quer imprimir uma mensagem na tela,
    *   esta que quando não tiver inserido nada mostraria que não foi inserido nada, podendo ser utilizada,
    *   por exemplo, em painéis de informações de espaços públicos.
    */
    public static void main(String[] args) {
        Mensagem m1 = new Mensagem();
        Mensagem m2 = new Mensagem("Testando");
        m1.Mostra();
        m1.Mostra("Olá");
        m2.Mostra();
        m2.Mostra("Olá");
    }
    
}
