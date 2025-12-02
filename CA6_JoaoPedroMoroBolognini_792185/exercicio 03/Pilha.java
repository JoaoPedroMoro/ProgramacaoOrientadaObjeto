package testepilha;
import java.util.ArrayList;
/**
 * @author João Pedro Moro Bolognini
 */
public class Pilha <T>{
    private int topo;
    private ArrayList<T> pilha = new ArrayList<>();

    public Pilha() {
        this.topo = 0;
    }  
    
    public void empilha(T item){ 
        this.pilha.add(item);
        this.topo++;
    }
    
    public T desempilha(){
        this.topo--;
        T valor=this.pilha.get(this.topo);
        this.pilha.remove(this.topo);
        return valor;
    }
    
    public int quantEmpilhados(){
        return this.topo;
    }
    
    public void imprimePilha(){
        for (int a=0; a<this.topo ;a++)
            System.out.println(this.pilha.get(a));
    }
}