package testepilha;

import java.util.Scanner;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 * @version 1.0
 */
public class TestePilha {
    
    public static void main(String[] args) {
        
        Pilha p = new Pilha(5);
        Scanner ler = new Scanner(System.in);
        int num;
        
        System.out.println("Digite numeros inteiros para serem empilhados (-1 para parar):");
        num = ler.nextInt();
        while(num != -1){
            p.empilha(num);
            num = ler.nextInt();
        }

        if(!p.vazia()) {
            num = p.itemTopo();
            System.out.println("Você acabou de empilhar e o elemento do topo da sua pilha é: " +  num);   
        }
        
        
        System.out.println("Ela tem  " +  p.quantEmpilhados()+ " elementos empilhados de um máximo possível de " + p.getMAX());   
        
        System.out.println("Hora de desempilhar os números que você digitou!");
        while(!p.vazia()){
            // O método desempilha deverá mostrar qual número foi retirado;
            num = p.desempilha();
            System.out.println("Numero desempilhado: " +  num);            
        }
        System.out.println("Agora a pilha está vazia!");
    }
    
}
