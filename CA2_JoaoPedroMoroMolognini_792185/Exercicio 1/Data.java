package exercicio01.ca2;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 * @version 1.0
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    public void atualizaDia(int d){
        this.dia=d;
    }
    public void atualizaMes(int m){
        this.mes=m;
    }
    public void atualizaAno(int a){
        this.ano=a;
    }
    public void mostraData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}
