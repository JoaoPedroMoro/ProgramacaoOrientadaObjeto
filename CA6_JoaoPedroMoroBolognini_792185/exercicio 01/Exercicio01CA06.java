package exercicio01ca06;
/**
 * @author João Pedro Moro Bolognini
 */
public class Exercicio01CA06 {

    public static void main(String[] args) {
        Generica<String> g1 = new Generica<>("c", "b");
        g1.imprimirIntervalo();
        Generica<Integer> g2 = new Generica<>(1, 10);
        g2.imprimirIntervalo();
        Generica<Double> g3 = new Generica<>(1.01, 1.1);
        g3.imprimirIntervalo();
        Generica<String> g4 = new Generica<>("a", "z");
        g4.imprimirIntervalo();
        Generica<Integer> g5 = new Generica<>(20, 7);
        g5.imprimirIntervalo();
    }
    
}
