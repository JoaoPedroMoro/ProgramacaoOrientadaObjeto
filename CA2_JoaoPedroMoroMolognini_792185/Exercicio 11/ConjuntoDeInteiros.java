package exercicio11.ca2;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 * @version 1.0
 */
public class ConjuntoDeInteiros {
    private int[] conjunto;

    public ConjuntoDeInteiros() {
        this.conjunto = new int[101];
        for (int i=0; i<101 ;i++)
            this.conjunto[i]=0;
    }
    public int[] uniaoDeConjuntoDeInteiros(ConjuntoDeInteiros conjunto){
        int[] conjuntoResultante = new int[101];
        for (int i=0; i<101 ;i++){
            if (this.conjunto[i] == 1 || conjunto.conjunto[i]==1)
                conjuntoResultante[i] = 1; 
            else 
                conjuntoResultante[i]=0;
        }
        return conjuntoResultante;
    }
    
    public int[] intersecaoDeConjuntoDeInteiros(ConjuntoDeInteiros conjunto){
        int[] conjuntoResultante = new int[101];
        for (int i=0; i<101 ;i++){
            if (this.conjunto[i] == 1 && conjunto.conjunto[i]==1)
                conjuntoResultante[i] = 1; 
            else 
                conjuntoResultante[i]=0;
        }
        return conjuntoResultante;
    }
    public void insereElemento(int elemento){
        this.conjunto[elemento]=1;
    }
    public void retiraElemento(int elemento){
        this.conjunto[elemento]=0;
    }

    public void imprimeConjunto(){
        boolean primeiroElemento=true;
        System.out.print("{");
        for(int i=0; i<101 ;i++){
            if(this.conjunto[i]==1){
                if (primeiroElemento==false){
                    System.out.print(", ");
                }
                System.out.print(i);
                primeiroElemento=false;
            }
        }
        System.out.println("}");
    }
    public int[] getConjunto() {
        return conjunto;
    }

    public void setConjunto(int[] conjunto) {
        this.conjunto = conjunto;
    }
    
}
