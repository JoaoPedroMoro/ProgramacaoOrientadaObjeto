package exercicio01ca3;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class Exercicio01CA3 {
    public static void main(String[] args) {
        Ponto p[] = new Ponto[6];
        p[0] = new Ponto(1, 3);
        p[1] = new Ponto (-10, -2);
        p[2] = new Ponto (11, 8);
        p[3] = new Ponto (10, 4);
        p[4] = new Ponto (13, 13);
        p[5] = new Ponto (2, 6);
        
        Circulo c1 = new Circulo (p[4], 13); 
        Circulo c2 = new Circulo (p[1], 1);
        
        SegmentoDeReta s1 = new SegmentoDeReta(p[0], p[5]);
        SegmentoDeReta s2 = new SegmentoDeReta(p[2], p[3]);
        
        System.out.println("Círculo 1:");
        c1.imprimir();
        /*c1.area();
        c1.perimetro();
        c1.posicaoPonto(0, 13);
        c1.posicaoPonto(5, 6);
        c1.posicaoPonto(0, 0);*/
        c1.getCentro();
        
        System.out.println("Círculo 2:");
        c2.imprimir();
        /*c2.posicaoPonto(11, 4);
        c2.posicaoPonto(15, 2);
        c2.posicaoPonto(15, 15);*/
        
        System.out.println("Segmento de reta 1:");
        s1.imprimir();
        //s1.comprimento();
        
        System.out.println("Segmento de reta 2:");
        s2.imprimir();
        //s2.comprimento();
    }
    
}
