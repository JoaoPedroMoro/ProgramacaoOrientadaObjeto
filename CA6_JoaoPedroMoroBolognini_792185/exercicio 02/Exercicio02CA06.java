package exercicio02ca06;
import java.util.ArrayList;
/**
 * @author João Pedro Moro Bolognini
 */
public class Exercicio02CA06 {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        
        l1.add(12);
        l1.add(23);
        l1.add(88);
        l1.add(36);
        l1.add(3);
        l1.add(48);
        
        l2.add("vassoura");
        l2.add("beterraba");
        l2.add("amora");
        l2.add("jeep");
        l2.add("papel");
        l2.add("feijao");
        l2.add("esqueleto");
        l2.add("keep");
        l2.add("abacaxi");
        l2.add("zorro");
        l2.add("leitura");
        l2.add("maneiro");
        l2.add("uva");
        l2.add("mantenha");
        
        
        OrdenarVetor<Integer> o1 = new OrdenarVetor<>(l1);
        OrdenarVetor<String> o2 = new OrdenarVetor<>(l2);
        o1.imprimeVetorOrdenado();
        o2.imprimeVetorOrdenado();
    }
    
}
