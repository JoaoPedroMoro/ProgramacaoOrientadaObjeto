package exercicio01ca05;
/**
 *
 * @author João Pedro Moro Bolognini
 */
public class Operacao {
    private double operando1;
    private double operando2;
    private char operador;
    private double resultado;
    private boolean executada;

    public Operacao(double operando1, double operando2, char operador) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.operador = operador;
        this.resultado=0;
        this.executada=false;
    }
    
    public double executa(){
        switch (this.operador) {
            case '+':
                this.resultado = soma(this.operando1, this.operando2);
                break;
            case '-':
                this.resultado = subtracao(this.operando1, this.operando2);
                break;
            case '*':
                this.resultado = multiplicacao(this.operando1, this.operando2);
                break;
            case '/':
                this.resultado = divisao(this.operando1, this.operando2);
                break;
            case 'p':
                this.resultado = potencia(this.operando1, this.operando2);
                break;
            case 'r':
                this.resultado = raiz(operando1, this.operando2);
                break;
            case 'l':
                this.resultado = log(this.operando1, this.operando2);
                break;
            default:
                break;
        }
        this.executada=true;
        return resultado;
    }

    @Override
    public String toString() {
        if (this.executada == true){
            return ("" + operando1 + "" + operador + "" + operando2 + " = " + resultado);
        } else {
            return "Não calculada";
        }     
    }
    
    private double soma(double op1, double op2){
        this.resultado = op1 + op2;
        return resultado;
    }
    
    private double subtracao(double op1, double op2){
        this.resultado = op1 - op2;
        return resultado;
    }
    
    private double multiplicacao(double op1, double op2){
        this.resultado = op1 * op2;
        return resultado;
    }
    
    private double divisao(double op1, double op2){
        this.resultado = op1 / op2;
        return resultado;
    }
    
    private double potencia(double op1, double op2){
        this.resultado = Math.pow(op1, op2);
        return resultado;
    }
    
    private double raiz (double op1, double op2){
        this.resultado = Math.pow(op1, 1/op2); // Um número elevado a uma fração é uma raiz elevada a base da fração.
        return resultado;
        
    }
    
    private double log(double op1, double op2){
        this.resultado = Math.log(op1)/Math.log(op2); // Mesma base, então a base fica o op2 e o logaritmando fica o op1.
        return resultado;
    }
}