package exercicio01ca3;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class SegmentoDeReta {
    private Ponto pontoFinal;
    private Ponto pontoInicial;

    public SegmentoDeReta(Ponto pontoFinal, Ponto pontoInicial) {
        this.pontoFinal = pontoFinal;
        this.pontoInicial = pontoInicial;
    }

    public Ponto getPontoFinal() {
        return pontoFinal;
    }

    public Ponto getPontoInicial() {
        return pontoInicial;
    }
    
    public void comprimento(){
        double comp;
        comp = Math.sqrt(Math.pow((this.pontoInicial.getX() - this.pontoFinal.getX()),2) 
                + Math.pow((this.pontoInicial.getY() - this.pontoFinal.getY()) ,2));
        System.out.println("O comprimento do segmento é " + comp);
    }
    
    public void imprimir(){
        System.out.println("Segmento: [(" + this.pontoInicial.getX() + ", " + this.pontoInicial.getY() 
                + "), (" + this.pontoFinal.getX() + ", " + this.pontoFinal.getY() + ")]");
    }
    
}
