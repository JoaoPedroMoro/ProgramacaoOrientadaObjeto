package exercicio04.ca2;
import java.util.*;

public class Exercicio04CA2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p = new Pessoa();
        int escolha;
        
        do{
            System.out.println("Digite 1 para adicionar passos, 2 para "
                    + "adicionar horas dormidas, 3 para adicionar uma refeição"
                    + " ou 0 para sair do programa");
            escolha=input.nextInt();
            if (escolha==1){
                int numPassos;
                float tamPasso;
                System.out.println("Informe o número de passos: ");
                numPassos=input.nextInt();
                System.out.println("Informe o tamanho do passo");
                tamPasso=input.nextFloat();
                p.andar(tamPasso, numPassos);
            }
            if (escolha==2){
                int nHoras;
                System.out.println("Informe o número de horas dormidas: ");
                nHoras=input.nextInt();
                p.dormir(nHoras);
            }
            if (escolha==3){
                p.comer();
            }
        } while (escolha!=0);
        p.checkup();
    }
    
}
