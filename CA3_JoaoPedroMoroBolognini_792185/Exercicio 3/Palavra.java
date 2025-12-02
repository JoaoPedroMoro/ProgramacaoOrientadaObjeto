package testadicionario;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class Palavra {
    private String nome;
    private String tipo;
    private Significado significado[];

    public Palavra(String nome, String tipo, String significado1) {
        this.nome = nome;
        this.tipo = tipo;
        this.significado = new Significado[1];
        this.significado[0]= new Significado(significado1);
    }
    public Palavra(String nome, String tipo, String significado1
            , String significado2) {
        this.nome = nome;
        this.tipo = tipo;
        this.significado = new Significado[2];
        this.significado[0]= new Significado(significado1);
        this.significado[1]= new Significado(significado2);
    }
    public Palavra(String nome, String tipo, String significado1,
            String significado2, String significado3) {
        this.nome = nome;
        this.tipo = tipo;
        this.significado = new Significado[3];
        this.significado[0]= new Significado(significado1);
        this.significado[1]= new Significado(significado2);
        this.significado[2] = new Significado(significado3);
    }
    public String getPalavra(){
        return nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void imprimir(){
        System.out.println("A palavra '" + this.getPalavra() + "' é um " + this.getTipo());
        int tamanho = this.significado.length;
        System.out.println("Seus significados são: ");
        for(int i=0; i<tamanho ;i++){
            significado[i].imprimir();
        }    
    }
    
}
