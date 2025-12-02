package exercicio01ca05;
import java.util.Scanner;
/**
 *
 * @author João Pedro Moro Bolognini
 */
public class Calculadora {
    private Operacao operacao;
    private double operando1;
    private double operando2;
    private int opcao=0;
    private char operador;
    private double resultado;
    private GravacaoVetor[] vetor = new GravacaoVetor[100]; // 100 é um exemplo, mas pode ser maior.
    private Operacao[] operacoes = new Operacao[100]; // 100 é um exemplo, mas pode ser maior.
    private int qtdeElementos=0;
    private int a=0;
    private Scanner ler = new Scanner(System.in);
    
    void calculo(){ 
        while (this.opcao != 9){
            try{
                System.out.println("Escolha uma das opções a seguir:");
                System.out.println("0 - Para efetuar a soma de dois operandos");
                System.out.println("1 - Para efetuar a subtração de dois operandos");
                System.out.println("2 - Para efetuar a multiplicação de dois operandos");
                System.out.println("3 - Para efetuar a divisão de dois operandos");
                System.out.println("4 - Para fazer a potência de dois operandos");
                System.out.println("5 - Para calcular a raiz de dois operandos");
                System.out.println("6 - Para calcular o log de dois operandos");
                System.out.println("7 - Para gravar as operações feitas em um arquivo");
                System.out.println("8 - Para carregar as operações a partir de um arquivo");
                System.out.println("9 - Para encerrar a calculadora");
                this.opcao = Integer.parseInt(ler.nextLine());
                if (this.opcao>=0 && this.opcao < 7){
                    System.out.print("Insira o operando 1: ");
                    this.operando1=ler.nextDouble();
                    System.out.print("Insira o operando 2: ");
                    this.operando2=ler.nextDouble(); 
                }
                switch (this.opcao) {
                    case 0:
                        this.operador='+';
                        operacao = new Operacao(this.operando1, this.operando2, this.operador);
                        operacoes[a] = new Operacao(this.operando1, this.operando2, this.operador);
                        setResultado(operacao.executa());
                        System.out.println(operacao.toString());
                        break;
                    case 1:
                        this.operador='-';
                        operacao = new Operacao(this.operando1, this.operando2, this.operador);
                        operacoes[a] = new Operacao(this.operando1, this.operando2, this.operador);
                        setResultado(operacao.executa());
                        System.out.println(operacao.toString());
                        break;
                    case 2:
                        this.operador='*';
                        operacao = new Operacao(this.operando1, this.operando2, this.operador);
                        operacoes[a] = new Operacao(this.operando1, this.operando2, this.operador);
                        setResultado(operacao.executa());
                        System.out.println(operacao.toString());
                        break;
                    case 3:
                        this.operador='/';
                        operacao = new Operacao(this.operando1, this.operando2, this.operador);
                        operacoes[a] = new Operacao(this.operando1, this.operando2, this.operador);
                        setResultado(operacao.executa());
                        System.out.println(operacao.toString());                   
                        break;
                    case 4:
                        this.operador='p';
                        operacao = new Operacao(this.operando1, this.operando2, this.operador);
                        operacoes[a] = new Operacao(this.operando1, this.operando2, this.operador);
                        setResultado(operacao.executa());
                        System.out.println(operacao.toString());
                        break;
                    case 5:
                        this.operador='r';
                        operacao = new Operacao(this.operando1, this.operando2, this.operador);
                        operacoes[a] = new Operacao(this.operando1, this.operando2, this.operador);
                        setResultado(operacao.executa());
                        System.out.println(operacao.toString());
                        break;
                    case 6:
                        this.operador='l';
                        operacao = new Operacao(this.operando1, this.operando2, this.operador);
                        operacoes[a] = new Operacao(this.operando1, this.operando2, this.operador);
                        setResultado(operacao.executa());
                        System.out.println(operacao.toString());
                        break;
                    case 7:
                        CriarArquivoTexto gravando = new CriarArquivoTexto();
                        gravando.openFile();
                        gravando.addRecords(vetor, qtdeElementos);
                        gravando.closeFile();
                        break;
                    case 8:
                        CarregarArquivoTexto carregando = new CarregarArquivoTexto();
                        carregando.readFile();
                        operacoes=carregando.copiarVetor();
                        int i;
                        for (i=0; i<100 ;i++){
                            if (operacoes[i] == null){
                                break;
                            } 
                        }
                        qtdeElementos = i; // Novo indice do vetor que foi copiado do arquivo.
                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("Opção inválida, insira novamente.");
                        break;
                }
                if (this.opcao>=0 && this.opcao < 7){
                    setVetor(this.qtdeElementos, operando1, operando2, operador, resultado); // Esse vetor auxilia na gravação em um arquivo.
                    setQtdeElementos();
                    a++; // O vetor operacoes é o principal do programa, ele que guarda as informações sobre as operacoes.
                }
            } catch (NumberFormatException numberFormatException){
                // Aqui ele apenas vai informar que não foi do formato correto a entrada e vai entrar no loop dnv.
                System.err.println("Não foi inserido um número, tente novamente.");
            }  
        }
    }
    
    public void printar(){
        for (int a=0; a<getQtdeElementos() ;a++){
            operacoes[a].executa();
            System.out.println(operacoes[a].toString());
        }
    }
    
    public void encerrarCalculadora(){
        ler.close();
    }
    
    public GravacaoVetor getVetor(int posicao) {
        return vetor[posicao];
    }

    public void setVetor(int qtde, double op1, double op2, char op, double res) {
        vetor[qtde] = new GravacaoVetor(op1, op2, op, res);
    }

    public int getQtdeElementos() {
        return qtdeElementos;
    }

    public void setQtdeElementos() {
        this.qtdeElementos = this.qtdeElementos + 1;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}