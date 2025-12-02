package exercicio01ca05;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.*;
/**
 *
 * @author João Pedro Moro Bolognini
 */
public class CarregarArquivoTexto {
    private File arquivo;
    private Operacao[] operacoes;
    private String nomeArquivo;
    private Scanner leitura = new Scanner(System.in);
   
    public String readFile(){
        String conteudoArquivo = ""; // O que vai ser lido do arquivo, inicialmente vazio.
        try{
            System.out.println("Digite o nome ou caminho do arquivo que deseja ler: ");
            nomeArquivo = leitura.nextLine();
            arquivo = new File(nomeArquivo);
            Scanner lerArquivo = new Scanner(arquivo);
            System.out.println("O conteúdo do arquivo é: ");
            while (lerArquivo.hasNextLine()){
                String linha = lerArquivo.nextLine();
                System.out.println(linha);
                conteudoArquivo += linha+"\n"; // Vai inserindo no leitor do arquivo as linhas dele com as quebras de linha.
            }
            lerArquivo.close();
        } catch (FileNotFoundException fileNotFoundException){
            // Se o arquivo não foi encontrado ele vai solicitar novamente para colocar o nome ou caminho dele denovo.
            System.err.println("Erro para encontrar o arquivo");
            conteudoArquivo = readFile();
        }
        return conteudoArquivo;
    }
    
    public Operacao[] copiarVetor(){
        Path arquivoP = Paths.get(nomeArquivo);
        double operando1;
        double operando2;
        double resultado;
        char operador;
        operacoes = new Operacao[100];
        try{
            byte[] conteudo = Files.readAllBytes(arquivoP);
            for (int a=0, i=0; a<conteudo.length && i<100 ;a++, i++){
                String linha = "";
                while (conteudo[a] != '+' && conteudo[a] != '-' && conteudo[a] != '*' && conteudo[a] !='/' && conteudo[a] != 'p' && conteudo[a] != 'r' && conteudo[a] != 'l'){
                    if (conteudo[a] == 44){
                        conteudo[a] = 46;
                    }
                    linha += (char)conteudo[a];
                    
                    if (a+1 == conteudo.length){
                        break;
                    }
                    a++;
                }
                operando1 = Double.valueOf(linha).doubleValue();
                operador = (char)conteudo[a];
                a++;
                linha = "";
                while (conteudo[a] != '='){
                    if (conteudo[a] == 44){
                        conteudo[a] = 46;
                    }
                    linha += (char)conteudo[a];
                    if (a+1 == conteudo.length){
                        break;
                    }
                    a++;
                }
                a++;
                operando2 = Double.valueOf(linha).doubleValue();
                linha = "";
                while (conteudo[a] != 10){
                    if (conteudo[a] == 44){
                        conteudo[a] = 46;
                    }
                    linha += (char)conteudo[a];
                    
                    if (a+1 == conteudo.length){
                        break;
                    }
                    a++;
                }
                resultado = Double.valueOf(linha).doubleValue();
                operacoes[i] = new Operacao(operando1, operando2, operador);
                operacoes[i].executa();
            }
        } catch (IOException ioException){
            // A entrada não foi correta, ele não faz a cópia.
            System.out.println("Erro de entrada");
        }
        return operacoes;
    }
}