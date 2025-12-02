package exercicio10ca04;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class Tracejada extends Linha{
    public void desenha(){
        for (int i=0; i<this.getTamanho() ;i++){
            if (i%2 == 0){
                System.out.print("-");
            } else {
                System.out.print(" ");
            }
        }
    }
}