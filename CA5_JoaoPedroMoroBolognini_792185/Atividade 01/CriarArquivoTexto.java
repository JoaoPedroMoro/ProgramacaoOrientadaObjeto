package exercicio01ca05;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
/**
 *
 * @author João Pedro Moro Bolognini
 */        
public class CriarArquivoTexto {
    private Formatter saida;
    Scanner entrada = new Scanner(System.in);
    GravacaoVetor[] gravacao;

    
    public void openFile(){
        try{
            String nomeArquivo;
            System.out.println("Insira o nome ou caminho do arquivo: ");
            nomeArquivo = entrada.nextLine();
            saida = new Formatter(nomeArquivo);
        }
        catch (SecurityException securityException){
            // O usuário não tem acesso, insira novamente outro arquivo.
            System.err.println("Você não tem acesso para escrever esse arquivo.");
            openFile();
        }
        catch (FileNotFoundException fileNotFoundException){
            // O arquivo não foi encontrado, insira novamente outro arquivo.
            System.err.println("Erro ao abrir ou criar o arquivo.");
            openFile();
        }
    }
    
    public void addRecords(GravacaoVetor[] vetor, int qtdeElementos){
        gravacao = new GravacaoVetor[qtdeElementos];
        for (int a=0; a<qtdeElementos ;a++){
            gravacao[a] = new GravacaoVetor(vetor[a]);
        }
        if (qtdeElementos>0){
            for (int a=0; a<qtdeElementos ;a++){
                saida.format("%.2f%s%.2f=%.2f%n", gravacao[a].getOperando1(), gravacao[a].getOperador(), gravacao[a].getOperando2(), gravacao[a].getResultado());
            }
        } else {
            System.out.println("Vetor vazio.");
        }
    }
    
    public void closeFile(){
        if (saida != null){
            saida.close();
        } else {
            System.out.println("Deu erro ao fechar o arquivo.");
        }
    }
}