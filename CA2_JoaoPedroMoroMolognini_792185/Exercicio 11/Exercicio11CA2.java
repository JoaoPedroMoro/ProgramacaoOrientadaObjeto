package exercicio11.ca2;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 * @version 1.0
 */
public class Exercicio11CA2 {
    public static void main(String[] args) {
        ConjuntoDeInteiros c1 = new ConjuntoDeInteiros();
        ConjuntoDeInteiros c2 = new ConjuntoDeInteiros();
        ConjuntoDeInteiros c3 = new ConjuntoDeInteiros();
        ConjuntoDeInteiros c4 = new ConjuntoDeInteiros();
        ConjuntoDeInteiros c5 = new ConjuntoDeInteiros();
        
        for (int i=0; i<101 ;i++){
            if (i%2==0){
                c1.insereElemento(i); // c1 é o conjunto dos números pares.
            }
            if (i%3==0){
                c2.insereElemento(i); // c2 é o conjunto dos múltiplos de 3.
            }
            if (i%5==0){
                c3.insereElemento(i); // c3 é o conjunto dos múltiplos de 5.
            }
            if (i%7==0){
                c4.insereElemento(i); // c4 é o conjunto dos múltiplos de 7.
            }
            if (i%11==0){
                c5.insereElemento(i); // c5 é o conjunto dos múltiplos de 11.
            }
        }
        
        ConjuntoDeInteiros c6 = new ConjuntoDeInteiros();
        c6.setConjunto(c1.uniaoDeConjuntoDeInteiros(c2));
        c6.imprimeConjunto();
        ConjuntoDeInteiros c7 = new ConjuntoDeInteiros(); 
        c7.setConjunto(c1.intersecaoDeConjuntoDeInteiros(c2));
        c7.imprimeConjunto();
        ConjuntoDeInteiros c8 = new ConjuntoDeInteiros();
        c8.setConjunto(c3.uniaoDeConjuntoDeInteiros(c4));
        c8.imprimeConjunto();
        c8.setConjunto(c8.intersecaoDeConjuntoDeInteiros(c7)); // Interseção da união de c3 e c4 com interseção de c1 e c2.
        c8.imprimeConjunto();
        c5.imprimeConjunto();
        for (int i=0; i<50 ;i+=11)
                c5.retiraElemento(i); // Retirando todos os múltiplos de 11 menores de 50.
        c5.imprimeConjunto();
        for (int i=0; i<101 ; i+=3)
                c1.retiraElemento(i); // Retirando todos os múltiplos de 2 que são múltiplos de 3.
        c1.imprimeConjunto();
        ConjuntoDeInteiros c9 = new ConjuntoDeInteiros();
        c9.setConjunto(c1.uniaoDeConjuntoDeInteiros(c5));
        c9.imprimeConjunto();
    }
    
}
