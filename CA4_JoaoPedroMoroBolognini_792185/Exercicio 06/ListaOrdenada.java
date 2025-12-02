package exercicio06ca04;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class ListaOrdenada extends Lista{

    public ListaOrdenada() {
        this.setInicio(null);
        this.setFim(null);
        this.setQtde(0);
    }
    
    @Override
    public void insere(int elemento){ // Obrigatoriamente sobreposto
        No temp = new No(elemento);
        No aux = this.getInicio();
        if (this.getQtde() == 0){
            this.setInicio(temp);
            this.setFim(temp);
            this.setQtde(1);
            return;
        }
        for (int i=0; i<this.getQtde() ;i++){
            if (aux.getElemento() > elemento && aux == this.getInicio()){
                temp.setProximo(this.getInicio());
                this.setInicio(temp);
                this.setQtde(this.getQtde()+1);
                return;
                
            }
            if (aux.getProximo() != null){
                if (aux.getElemento()<elemento && aux.getProximo().getElemento()>elemento){
                    temp.setProximo(aux.getProximo());
                    aux.setProximo(temp);
                    this.setQtde(this.getQtde()+1);
                    return;
                }
            }    
            if (aux.getElemento()<elemento && aux.getProximo() == null){
                aux.setProximo(temp);
                this.setQtde(this.getQtde()+1);
                return;
            }
            if (aux.getElemento()<elemento && aux.getProximo() != null){
                aux = aux.getProximo();
            }
        }
    }
    
    @Override 
    public int localiza(int elemento){ // Pode ser sobreposto pela eficiencia melhor
        if (this.vazia()){
            System.out.println("Lista vazia");
            return 0;
        }
        No temp = this.getInicio();
        for (int i=0; i<this.getQtde() ;i++){
            if (temp.getElemento() == elemento){
                return i;
            }
            if (temp.getProximo() != null){
                temp = temp.getProximo();
            }
            if (temp.getElemento() > elemento){
                break;
            }
        }
        return -1;
    }
}
