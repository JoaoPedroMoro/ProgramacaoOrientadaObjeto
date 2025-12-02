package exercicio02ca3;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class PilhaDeCirculos {
    private int topo;
    private Circulo[] circulos;

    public PilhaDeCirculos(int max) {
        this.setTopo(0);
        this.circulos = new Circulo[max];
        Ponto temp = new Ponto(0, 0);
        for (int i=0; i<max ;i++)
            this.circulos[i] = new Circulo(temp, 0);
    }
    public boolean vazia(){
        return (this.getTopo() == 0);
    }
    public boolean cheia(){
        return this.circulos.length==this.getTopo();
    }
    public void empilha(Circulo circulo){
        if (this.cheia())
            return;
        this.circulos[this.getTopo()]=circulo;
        this.setTopo(this.topo+1);
    }
    public Circulo desempilha(){
        Ponto temp = new Ponto(0, 0);
        this.setTopo(this.topo-1);
        Circulo circulo = this.circulos[this.getTopo()];
        this.circulos[this.getTopo()] = new Circulo(temp, 0);
        return circulo;
    }
    public Circulo itemTopo(){
        return this.circulos[this.getTopo()-1];
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
        return this.circulos.length;
    }
}
