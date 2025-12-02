package exercicio10ca04;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
import java.util.*;
public class Exercicio10CA04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Gerenciador gerenciador = null;
        System.out.println("Insira a quantidade de linhas que vai "
                + "inserir (no máximo 50)");
        int qtdeLinhas = ler.nextInt();
        for (int i=0; i<qtdeLinhas ;i++){
            String tipo, cor;
            int tamanho;
            System.out.println("Linha " + (i+1));
            System.out.println("Insira o tipo da linha: ");
            tipo = ler.next();
            System.out.println("Insira a cor da linha: ");
            cor = ler.next();
            System.out.println("Insira o tamanho da linha: ");
            tamanho = ler.nextInt();
            if (i == 0){
                gerenciador = new Gerenciador(tipo, tamanho, cor);
            } else {
                gerenciador.inserirLinha(tipo, tamanho, cor);
            }
        }
        
        gerenciador.desenharLinhas();
        /*for (int i=0; i<qtdeLinhas ;i++){
            System.out.println("A cor da linha " + (i+1) + " é " + gerenciador.linhas[i].getCor());
        }
        gerenciador.pintarLinhas("preto");
        for (int i=0; i<qtdeLinhas ;i++){
            System.out.println("A cor da linha " + (i+1) + " é " + gerenciador.linhas[i].getCor());
        }*/
        
        ler.close();
    }
    
}
