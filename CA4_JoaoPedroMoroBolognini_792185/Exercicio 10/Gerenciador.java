package exercicio10ca04;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class Gerenciador {
    private int numeroLinhas;
    Linha linhas[] ;

    public Gerenciador(String tipo, int tamanho, String cor) {
        this.numeroLinhas = 0;
        linhas = new Linha[50];
        inserirLinha(tipo, tamanho, cor);
    }
    
    public void inserirLinha(String tipo, int tamanho, String cor){
        if ("Continua".equals(tipo)){
            Continua c = new Continua();
            c.setCor(cor);
            c.setTamanho(tamanho);
            linhas[this.numeroLinhas] = c;
            this.numeroLinhas++;
        } else if ("Pontilhada".equals(tipo)){
            Pontilhada p = new Pontilhada();
            p.setCor(cor);
            p.setTamanho(tamanho);
            linhas[this.numeroLinhas] = p;
            this.numeroLinhas++;      
        } else if ("Tracejada".equals(tipo)){
            Tracejada t = new Tracejada();
            t.setCor(cor);
            t.setTamanho(tamanho);
            linhas[this.numeroLinhas] = t;
            this.numeroLinhas++;  
        }
    }
    public void desenharLinhas(){
        for (int i=0; i<this.numeroLinhas ;i++){
            linhas[i].desenha();
            System.out.println("");
        }
    }
    public void pintarLinhas(String cor){
        for (int i=0; i<this.numeroLinhas ;i++){
            linhas[i].setCor(cor);
        }
    }
}
