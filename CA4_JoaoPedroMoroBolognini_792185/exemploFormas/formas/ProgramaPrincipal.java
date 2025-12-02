import java.util.Scanner;
public class ProgramaPrincipal {
    public static void main(String args[]){
        GerenciadorFormas programa = new GerenciadorFormas();
        int selecao = 0;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("1 - Criar uma nova forma");
            System.out.println("2 - Mostrar formas");
            System.out.println("3 - Sair");
            System.out.println("O que você deseja fazer?");
            selecao = ler.nextInt();

            switch (selecao) {
                case 1:
                    programa.criaForma();
                break;

                case 2:
                    programa.mostrarFormas();
                break;

                case 3:
                    System.out.println("Adeus!");
                break;
            
                default:
                    System.out.println("Entrada inválida");
                break;
            }
        } while (selecao != 3);

        ler.close();
    }
}
