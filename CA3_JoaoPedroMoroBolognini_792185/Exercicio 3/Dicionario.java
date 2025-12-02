package testadicionario;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class Dicionario { // O dicionario tem palavras, que por sua vez tem siginificados.
    private String idioma;
    private int quantPalavras;
    static final int MAXPALAVRAS = 1000;
    private Palavra palavras[];

    public Dicionario(String idioma, int quantPalavras) {
        this.idioma = idioma;
        this.quantPalavras = 0;
        this.palavras = new Palavra[quantPalavras];
    }
    public Dicionario(String idioma) {
        this.idioma = idioma;
        this.quantPalavras = 0;
        this.palavras = new Palavra[this.MAXPALAVRAS];
    }
    public void adicionarPalavra(String palavra, String tipo, 
            String significado1, String significado2, String significado3){
        if (this.quantPalavras < this.palavras.length){
            this.palavras[quantPalavras]= new Palavra(palavra, tipo, significado1,
                significado2, significado3);
            quantPalavras++;
        } else {
            System.out.println("O dicionário está cheio.");
        }
        
    }
    public void adicionarPalavra(String palavra, String tipo, 
            String significado1, String significado2){
        if (this.quantPalavras < this.palavras.length){
            this.palavras[quantPalavras]= new Palavra(palavra, tipo, significado1,
                significado2);
            quantPalavras++;
        } else {
            System.out.println("O dicionário está cheio.");
        }    
    }
    public void adicionarPalavra(String palavra, String tipo, 
            String significado1){
        if (this.quantPalavras < this.palavras.length){
            this.palavras[quantPalavras]= new Palavra(palavra, tipo, significado1);
            quantPalavras++;
        } else {
            System.out.println("O dicionário está cheio.");
        }    
    }
    public void imprimir(){
        System.out.println("Imprimindo o dicionário do idioma " + this.idioma);
        for (int i=0; i<this.quantPalavras ;i++)
            palavras[i].imprimir();
    }
    public void imprimir(String palavra){
        System.out.println("Imprimindo o dicionário do idioma " + this.idioma);
        for (int i=0; i<this.quantPalavras ;i++){
            if (palavras[i].getPalavra() == palavra){
                palavras[i].imprimir();
            }
        }    
    }
}
