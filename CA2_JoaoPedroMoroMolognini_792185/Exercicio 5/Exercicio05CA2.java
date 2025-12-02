package exercicio05.ca2;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 * @version 1.0
 */
import java.time.LocalDate;

public class Exercicio05CA2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Data d1 = new Data(13, "setembro", 2021);//localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear()
        Data d2= new Data(19, "junho", 2000); //19, 06, 2000
        Data d3= new Data(30, "aaaaa", 2020 ); //37, 13, 1827
        d1.setDia(localDate.getDayOfMonth());
        //d1.setMes(localDate.getMonthValue());
        //d1.setAno(localDate.getYear());
        d1.mostraData();
        //d2.setDia(19);
        //d2.setMes(06);
        //d2.setAno(2000);
        d2.mostraData();
        //d3.setDia(37);
        //d3.setMes(13);
        //d3.setAno(1827);
        d3.mostraData();
    }
    
}
