package testepilha;
import java.util.Scanner;
/**
 * @author João Pedro Moro Bolognini
 */
public class TestePilha {

    public static void main(String[] args) {
        // Teste com pilha de inteiros
        Pilha<Integer> p = new Pilha<>();
        for (int a=0; a<10 ;a++)
            p.empilha(a);
        p.imprimePilha();
        
        // Teste com pilha de strings.
        Pilha<String> ps = new Pilha<>();
        Scanner ler = new Scanner(System.in);
        String caractere; // As partes da pilha que serão lidas.
        char pontuacaoFinal; // Salva a pontuação final para colocá-la ao fim da frase.
        while (true){
            caractere = ler.next();
            // Se for um dos três caracteres de fim de frase, vai parar o while
            if (caractere.contains(".") || caractere.contains("!") || caractere.contains("?")){
                int tam = caractere.length(); // Descobre a quantidade de caracteres da string.
                pontuacaoFinal = caractere.charAt(tam-1); // Sabendo a quantidade de caracteres, obtêm-se a pontuação final.
                // Vai retirar a pontuacao final da string e adicioná-la à pilha.
                if (caractere.contains("!")){
                    caractere = caractere.replace("!", "");
                } else if (caractere.contains(".")){
                    caractere = caractere.replace(".", "");
                } else {
                    caractere = caractere.replace("?", "");
                }
                ps.empilha(caractere);
                break;
            }
            ps.empilha(caractere); // Empilha a string.   
        }
        // Aqui vamos imprimi-lá ao contrário.
        for (int a = ps.quantEmpilhados(); a>0 ;a--){
            if (a == 1)
                System.out.println(ps.desempilha() + "" + pontuacaoFinal); // Se for o ultimo elemento da pilha, imprime a pontuação junto.
            else
                System.out.print(ps.desempilha() + " "); // Se não for, imprime o topo da pilha.
        }
        ler.close();
    }
    
}
