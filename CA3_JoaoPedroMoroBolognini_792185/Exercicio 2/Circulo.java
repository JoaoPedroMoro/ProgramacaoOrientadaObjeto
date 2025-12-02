package exercicio02ca3;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class Circulo {
    private Ponto centro;
    private int raio;

    public Circulo(Ponto centro, int raio) {
        this.centro = centro;
        this.raio = raio;
    }
    
    public Ponto getCentro() {
        return centro;
    }

    public int getRaio() {
        return raio;
    }
    
    public void perimetro(){
        double comp;
        comp = 2*Math.PI*this.raio;
        System.out.println("O perímetro do círculo é " + comp);
    }
    
    public void area(){
        double area;
        area = Math.PI*this.raio*this.raio;
        System.out.println("A área do círculo é " + area);
    }
    
    public void posicaoPonto(int xPonto, int yPonto){
        double calculo;
        calculo = Math.pow((xPonto - this.centro.getX()), 2) 
                + Math.pow((yPonto - this.centro.getY()), 2);
        if (calculo < Math.pow(this.raio, 2)){
            System.out.println("O ponto é interno ao círculo");
        } else if (calculo > Math.pow(this.raio, 2)){
            System.out.println("O ponto é externo ao círculo");
        } else {
            System.out.println("O ponto pertence ao círculo");
        }
    }
    
    public void imprimir(){
        System.out.println("Círculo: [(" + this.centro.getX() + ", " 
                + this.centro.getY() + "), " + this.raio + "]");
    }
}
