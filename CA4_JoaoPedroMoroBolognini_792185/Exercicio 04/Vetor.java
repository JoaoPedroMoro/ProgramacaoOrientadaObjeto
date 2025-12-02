package exercicio04ca04;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class Vetor {
    protected int[] v;
    protected int numElem;
    protected static int maximo=100;

    public Vetor(int elemento, int numeroElementos) {
        this.v = new int[maximo];
        this.numElem=numeroElementos;
        for (int i=0; i<numeroElementos ;i++) // vai preencher o vetor com o elemento fornecido nas proximas numeroElementos posicoes.
            v[i]=elemento;
    }

    public Vetor() {
        this.v = new int[maximo];
        this.numElem=0;
        for (int i=0; i<maximo ;i++)
            v[i]=0;
    }
    
    public boolean inserir(int elemento){
        if (this.numElem==maximo)
            return false;
        else{
            this.v[numElem]=elemento;
            this.numElem++;
        } 
        return true;       
    }
    
    public boolean remover(int elemento){
        boolean encontrouElem=false;
        if (this.numElem==0){
            return false;
        } else {
            for (int i=0; i<this.numElem ;i++){
                if (this.v[i]==elemento){
                    encontrouElem=true;
                    for (int b=i; b<this.numElem ;b++){
                        v[b]=v[b+1];
                        if (b+1 == (this.numElem)-1)
                            v[b+1]=0;
                    }
                   this.numElem--;
                }
            }
        }
        return encontrouElem;   
    }
    
    public int recuperarElemento(int posicao){
        if (this.numElem>=posicao)
            return -1;
        return v[posicao-1];
        
    }
    
    public void preencher(int elemento, int numeroRepeticoes){
        for (int i=0, b=this.numElem; i<numeroRepeticoes ;i++, b++){
            this.v[b]=elemento;
            this.numElem++;
        }
    }
    public void imprimir(){
        for (int i=0; i<this.numElem ;i++){
            System.out.printf("%d ", v[i]);
        }
        System.out.println("");
    }  
}
