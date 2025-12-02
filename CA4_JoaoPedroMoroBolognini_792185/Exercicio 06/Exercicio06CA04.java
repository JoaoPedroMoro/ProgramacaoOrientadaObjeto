package exercicio06ca04;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
import java.util.*;
public class Exercicio06CA04 {
    
    public static void main(String[] args) {
        Lista lista = new Lista();
        ListaOrdenada listaOrdenada = new ListaOrdenada();
        int l, n;
        Scanner ler = new Scanner(System.in);
        l = ler.nextInt();
        n = ler.nextInt();
        
        System.out.println("Lista");
        for (int i=0; i<l ;i++){
            lista.insere(ler.nextInt());
        }
        System.out.println("Lista ordenada");
        for (int i=0; i<n ;i++){
            listaOrdenada.insere(ler.nextInt());
        }
        System.out.print("Lista: ");
        lista.mostrar();
        System.out.println("");
        System.out.print("Lista ordenada: ");
        listaOrdenada.mostrar();
        System.out.println("");
        System.out.println("Removendo o elemento incial: " + lista.removeInicio());
        System.out.println("Removendo o elemento final: " + lista.removeFim());
        System.out.print("Lista: ");
        lista.mostrar();
        System.out.println("");
        System.out.println("Removendo o elemento incial: " + lista.removeInicio());
        System.out.print("Lista: ");
        lista.mostrar();
        System.out.println("");
        System.out.print("Lista ordenada: ");
        System.out.println("Removendo o elemento inicial: " + listaOrdenada.removeInicio());
        System.out.println("Removendo o elemento final: " + listaOrdenada.removeFim());
        listaOrdenada.mostrar();
        System.out.println("");
        System.out.println("Removendo o elemento inicial: " + listaOrdenada.removeInicio());
        System.out.print("Lista ordenada: ");
        listaOrdenada.mostrar();
        System.out.println("");
        
        ler.close();
    }
    
}
