package exercicio10ca04;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public abstract class Linha {
    private int tamanho;
    private String cor;
    
    abstract public void desenha();

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
