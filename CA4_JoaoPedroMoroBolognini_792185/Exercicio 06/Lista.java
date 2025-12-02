package exercicio06ca04;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class Lista {
    private No inicio;
    private No fim;
    private int qtde;

    public Lista() {
        this.inicio = null;
        this.fim = null;
        this.qtde = 0;
    }
    
    public boolean vazia(){
        if (this.qtde == 0)
            return true;
        else
            return false;
    }
    
    public void insere(int elemento){
        No temp = new No(elemento);
        if (this.qtde == 0){
            this.inicio = temp;
            this.fim = temp;
            this.qtde++;
        } else {
            this.fim.setProximo(temp);
            this.fim=temp;
            this.qtde++;
        }
    }
    
    public int removeInicio(){
        if (this.vazia()){
            System.out.println("Lista vazia");
            return 0;
        }
        int elemento = this.inicio.getElemento();
        this.inicio=this.inicio.getProximo();
        this.qtde--;
        return elemento;
    }
    
    public int removeFim(){
        if (this.vazia()){
            System.out.println("Lista vazia");
            return 0;
        }
        No temp = this.inicio;
        int elemento;
        for (int i=0; i<this.qtde-2 ;i++){
            temp = temp.getProximo();
        }
        No aux = temp.getProximo();
        elemento = aux.getElemento();
        temp.setProximo(null);
        this.qtde--;
        return elemento;
    }
    
    public int localiza(int elemento){
        if (this.vazia()){
            System.out.println("Lista vazia");
            return -1;
        }
        No temp = this.inicio;
        for (int i=0; i<this.qtde ;i++){
            if (temp.getElemento() == elemento){
                return i;
            }
            if (temp.getProximo() != null){
                temp = temp.getProximo();
            }
        }
        return -1;
    }
    
    public void mostrar(){
        if (this.vazia()){
            System.out.println("Lista vazia");
            return;
        }
        No temp = this.inicio;
        for (int i=0; i<this.qtde ;i++){
            System.out.print(temp.getElemento() + " ");
            if (temp.getProximo() != null){
                temp = temp.getProximo();
            }
        }
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
    
}
