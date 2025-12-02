package exercicio10ca04;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class Pontilhada extends Linha{
    public void desenha(){
        for (int i=0; i<this.getTamanho() ;i++){
            System.out.print(".");
        }
    }
}
