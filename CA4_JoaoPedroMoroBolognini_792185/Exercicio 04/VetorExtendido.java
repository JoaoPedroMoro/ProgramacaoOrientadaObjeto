package exercicio04ca04;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class VetorExtendido extends Vetor {

    public VetorExtendido(int elemento, int numeroElementos) {
        super(elemento, numeroElementos);
    }

    public VetorExtendido() {
        super();
    }
    
    public int primeiroElemento(){
        if (numElem != 0)
            return v[0];
        else 
            return 0;
    }
    public int ultimoElemento(){
        if (numElem != 0)
            return v[numElem-1];
        else
            return 0;
    }
    public int somaElementos(){
        if (numElem == 0)
            return 0;
        int total=0;
        for (int a=0; a<numElem ;a++){
            total+=v[a];
        }
        return total;
    }
    public float mediaElementos(){
        if (numElem == 0)
            return 0;
        int total=0;
        for (int a=0; a<numElem ;a++){
            total+=v[a];
        }
        return total/numElem;
    }
    public boolean elementoPertence(int elemento){
        if (numElem == 0)
            return false;
        for (int a=0; a<numElem ;a++){
            if (elemento == v[a]){
                return true;
            }
        }
        return false;
    }
}
