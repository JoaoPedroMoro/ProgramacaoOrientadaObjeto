package exercicio02ca3;
import java.util.Scanner;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class Exercicio02CA3 {
    public static void main(String[] args) {
        PilhaDeCirculos pCirculos = new PilhaDeCirculos(100);
        PilhaDePontos pPontos = new PilhaDePontos(100);
        Scanner ler = new Scanner(System.in); // TEM QUE FECHAR O SCANNER, NÃO ESQUECER
        Circulo circulo;
        Ponto ponto;
        
        int x;
        int y;
        int raio;
        System.out.println("Digite os pontos do centro e depois o raio "
                + "do circulo desejado(Para parar coloque todos como 1000):");
        x = ler.nextInt();
        y = ler.nextInt();
        raio = ler.nextInt();
        while((x != 1000) && (y != 1000) && (raio != 1000)){
            Ponto temp = new Ponto(x, y);
            circulo = new Circulo (temp, raio);
            pCirculos.empilha(circulo);
            x = ler.nextInt();
            y = ler.nextInt();
            raio = ler.nextInt();
        }
        
        if (!pCirculos.vazia()){
            circulo = pCirculos.itemTopo();
            System.out.println("Você acabou de empilhar e o elemento do topo da sua pilha é: ");
            circulo.imprimir();
        }
        
        System.out.println("Ela tem " + pCirculos.quantEmpilhados() +
                " elementos de um máximo possível de " + pCirculos.getMAX());
        
        System.out.println("Hora de desempilhar os círculos que você digitou");
        while(!pCirculos.vazia()){
            // O método desempilha deverá mostrar qual círculo que foi removido.
            circulo = pCirculos.desempilha();
            System.out.println("Círculo desempilhado é: ");
            circulo.imprimir();
        }
        
        System.out.println("Digite os pontos para adicionar na pila (ponto(1000, 1000) para parar).");
        x = ler.nextInt();
        y = ler.nextInt();
        while((x != 1000) && (y != 1000)){
            ponto = new Ponto (x, y);
            pPontos.empilha(ponto);
            x = ler.nextInt();
            y = ler.nextInt();
        }
        
        if (!pCirculos.vazia()){
            ponto = pPontos.itemTopo();
            System.out.println("Você acabou de empilhar e o elemento do topo da sua pilha é: ");
            ponto.imprimir();
        }
        
        if (!pPontos.vazia()){
            ponto = pPontos.itemTopo();
            System.out.println("Você acabou de empilhar e o elemento do topo da sua pilha é: ");
            ponto.imprimir();
        }
        
        System.out.println("Ela tem " + pPontos.quantEmpilhados() +
                " elementos de um máximo possível de " + pPontos.getMAX());
        
        System.out.println("Hora de desempilhar os pontos que você digitou");
        while(!pPontos.vazia()){
            // O método desempilha deverá mostrar qual círculo que foi removido.
            ponto = pPontos.desempilha();
            System.out.println("Ponto desempilhado é: ");
            ponto.imprimir();
        }
        ler.close();
    }
    
}
