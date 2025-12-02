import java.lang.Math;

public abstract class Forma {
    
    private String nome;
    private int dimensoes;
    protected final static float pi = (float) Math.PI;

    public Forma(int nD, String nomeForma){
        this.dimensoes = nD;
        this.nome = nomeForma;
    }

    public int nDimensoes(){
        return this.dimensoes;
    }
    public String nomeForma(){
        return this.nome;
    }

    abstract public float perimetro();
    abstract public float area();
    abstract public float volume();
}
