package exercicio01ca3;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void imprimir(){
        System.out.println("Ponto: (" + this.x +", " + this.y + ")");
    }
}
