package exercicio04ca04;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
import java.util.Scanner;
public class Exercicio04CA04 {

    public static void main(String[] args) {
        
        // Cria objetos
        VetorExtendido vet = new VetorExtendido();
        VetorExtendido vet2 = new VetorExtendido(2,40); //elemento, número de elementos

        // Utiliza a classe Scanner para ler entradas
        Scanner ler =  new Scanner(System.in);

        int menu = 0;
        int elemento;
        int nRepeticoes;
        int posicao;
        int recuperado;

        while(menu != 6){
            System.out.println("Escolha uma das opcoes abaixo:");
            System.out.println("1 - Para inserir um elemento no vetor.");
            System.out.println("2 - Para remover um elemento no vetor.");
            System.out.println("3 - Para recuperar um elemento no vetor.");
            System.out.println("4 - Para preencher o vetor com um determinado elemento.");
            System.out.println("5 - Para imprimir os elementos do vetor.");
            System.out.println("6 - Para Sair.");
            menu = ler.nextInt();

            switch (menu){
                case 1:{
                    System.out.println("Digite o elemento que deseja inserir");
                    elemento = ler.nextInt();
                    if(vet.inserir(elemento))
                        System.out.println("Elemento " + elemento + " inserido com sucesso!");
                    else
                        System.out.println("Nao foi possivel inserir o elemento, verifique se o vetor nao esta cheio");
                    break;
                }
                case 2:{
                    System.out.println("Digite o elemento que deseja remover");
                    elemento = ler.nextInt();
                    if(vet.remover(elemento))
                        System.out.println("Elemento " + elemento + " removido com sucesso!");
                    else
                        System.out.println("Nao foi possivel encontrar o elemento ou vetor esta vazio!");
                    break;
                }
                case 3:{
                    System.out.println("Digite a posicao do elemento que deseja recuperar");
                    posicao = ler.nextInt();
                    recuperado = vet.recuperarElemento(posicao);
                    if (recuperado != -1)
                        System.out.println("O elemento da posição " + posicao + " é: " + recuperado);
                    else
                        System.out.println("Não foi possível encontrar o elemento da posição inserida!");
                    break;
                }
                case 4:{
                    System.out.println("Digite o numero com o qual voce deseja preencher o vetor");
                    elemento = ler.nextInt();
                    System.out.println("Quantas repeticoes do elemento voce deseja?");
                    nRepeticoes = ler.nextInt();
                    vet.preencher(elemento, nRepeticoes);
                    break;
                }
                case 5:{
                    System.out.println("vet: ");
                    vet.imprimir();
                    break;
                }
                case 6:{
                    System.out.println("ADEEEEUUUS!!!!");
                    break;
                }
                default:{
                    System.out.println("Digite um número válido:");
                    break;
                }
            }
        }
        System.out.println(vet.primeiroElemento());
        System.out.println(vet.ultimoElemento());
        System.out.println(vet.somaElementos());
        System.out.println(vet.mediaElementos());
        System.out.println(vet.elementoPertence(15));
        System.out.println(vet2.primeiroElemento());
        System.out.println(vet2.ultimoElemento());
        System.out.println(vet2.somaElementos());
        System.out.println(vet2.mediaElementos());
        System.out.println(vet2.elementoPertence(2));
        System.out.println(vet2.elementoPertence(15));
        
        ler.close();
    }
    
}
