package exercicio04.ca2;
public class Pessoa implements Controle {
   float distancia;
   int nHoras;
   int nRefeicoes;

    public Pessoa() {
        this.distancia=0;
        this.nHoras=0;
        this.nRefeicoes=0;
    }
   
   void darUmPasso(float tamPasso){
       this.distancia+=tamPasso;
   }
    @Override
    public void andar(float tamPasso, int nPassos) {
        for (int i=0; i<nPassos ;i++)
            this.darUmPasso(tamPasso);
    }

    @Override
    public void comer() {
        this.nRefeicoes++;
    }

    @Override
    public void dormir(int numHoras){
        this.nHoras+=numHoras;
    }

    @Override
    public void checkup() {
        System.out.println("Número de metros andados: " + this.distancia);
        System.out.println("Número de horas dormidas: " + this.nHoras);
        System.out.println("Número de refeições feitas: " + this.nRefeicoes);
    }
   
}
