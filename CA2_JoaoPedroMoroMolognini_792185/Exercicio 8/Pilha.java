package testepilha;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 * @version 1.0
 */
public class Pilha {
    private int topo;
    private int[] itens;

    public Pilha(int max) {
        this.setTopo(0);
        this.itens = new int[max];
        for (int i=0; i<max ;i++)
            this.itens[i]=-1;
    }  
    public boolean vazia(){
        return (this.getTopo() == 0);
    }
    
    public boolean cheia(){
        return this.itens.length==this.getTopo();
    }
    public void empilha(int item){ 
        if (this.cheia())
            return;
        this.itens[this.getTopo()]=item;
        this.setTopo(this.topo+1);
    }
    public int desempilha(){
        this.setTopo(this.topo-1);
        int valor=this.itens[this.getTopo()];
        this.itens[this.getTopo()]=-1;
        return valor;
    }
    public int itemTopo(){
        return this.itens[this.getTopo()-1];
    }
    public int quantEmpilhados(){
        return this.getTopo();
    }

    public int getTopo() {
        return this.topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }
    
    public int getMAX(){
        return this.itens.length;
    }
}