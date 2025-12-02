package exercicio01ca05;
/**
 *
 * @author João Pedro Moro Bolognini
 */
public class GravacaoVetor {
    private double operando1;
    private double operando2;
    private char operador;
    private double resultado;

    
    public GravacaoVetor(){
        setOperando1(0);
        setOperando2(0);
        setOperador('0');
        setResultado(0);
    }
    public GravacaoVetor(double operando1, double operando2, char operador, double resultado) {
        setOperando1(operando1);
        setOperando2(operando2);
        setOperador(operador);
        setResultado(resultado);
    }
    public GravacaoVetor(GravacaoVetor vetor) {
        setOperando1(vetor.operando1);
        setOperando2(vetor.operando2);
        setOperador(vetor.operador);
        setResultado(vetor.resultado);
    }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
}
