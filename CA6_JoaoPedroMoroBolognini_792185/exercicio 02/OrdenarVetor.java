package exercicio02ca06;
import java.util.ArrayList;
import java.util.Collections;
/**
 * @author João Pedro Moro Bolognini
 */
public class OrdenarVetor <T extends Comparable <T>>{
    private ArrayList<T> vetor = new ArrayList();

    /**
     * Recebe o vetor como parâmetro, adiciona na lista todos os elementos dele
     * e depois ordena os elementos.
     * @param vetor 
     */
    public OrdenarVetor(ArrayList<T> vetor) {
        for (int a=0; a < vetor.size() ;a++)
            this.vetor.add(vetor.get(a));
        Collections.sort(this.vetor);
    }
    
    /**
     * Vai imprimir o vetor que já está ordenado.
     */
    public void imprimeVetorOrdenado(){
        for (int a=0; a<this.vetor.size() ;a++)
            System.out.println(this.vetor.get(a));
    }
    
}
