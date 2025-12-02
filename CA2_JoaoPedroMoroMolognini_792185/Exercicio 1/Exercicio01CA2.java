package exercicio01.ca2;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 * @version 1.0
 */
import java.time.LocalDate;

public class Exercicio01CA2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Data d1 = new Data();
        Data d2= new Data();
        Data d3= new Data();
        d1.atualizaDia(localDate.getDayOfMonth());
        d1.atualizaMes(localDate.getMonthValue());
        d1.atualizaAno(localDate.getYear());
        d1.mostraData();
        d2.atualizaDia(19);
        d2.atualizaMes(06);
        d2.atualizaAno(2000);
        d2.mostraData();
        d3.atualizaDia(37);
        d3.atualizaMes(13);
        d3.atualizaAno(1827);
        d3.mostraData();
    }
    
}
