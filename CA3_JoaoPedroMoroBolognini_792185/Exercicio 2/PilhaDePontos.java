package exercicio02ca3;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class PilhaDePontos {
    private int topo;
    private Ponto[] pontos;
    
    public PilhaDePontos(int max) {
        this.setTopo(0);
        this.pontos = new Ponto[max];
        for (int i=0; i<max ;i++)
            this.pontos[i] = new Ponto(0, 0);
    }
    public boolean vazia(){
        return (this.getTopo() == 0);
    }
    public boolean cheia(){
        return this.pontos.length==this.getTopo();
    }
    public void empilha(Ponto ponto){
        if (this.cheia())
            return;
        this.pontos[this.getTopo()]=ponto;
        this.setTopo(this.topo+1);
    }
    public Ponto desempilha(){
        //Ponto temp = new Ponto(0, 0);
        this.setTopo(this.topo-1);
        Ponto ponto = this.pontos[this.getTopo()];
        this.pontos[this.getTopo()] = new Ponto(0, 0);
        return ponto;
    }
    public Ponto itemTopo(){
        return this.pontos[this.getTopo()-1];
    }
    public int quantEmpilhados(){
        return this.getTopo();
    }
    public int getTopo() {
        return topo;
    }
    public void setTopo(int topo) {
        this.topo = topo;
    }
    public int getMAX(){
        return this.pontos.length;
    }
}
