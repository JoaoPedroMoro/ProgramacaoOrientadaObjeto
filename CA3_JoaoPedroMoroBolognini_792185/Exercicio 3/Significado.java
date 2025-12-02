package testadicionario;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class Significado {
    private String descricao;

    public Significado(String descricao) {
        this.setDescricao(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    void imprimir(){
        System.out.println(this.getDescricao());
    }
}
