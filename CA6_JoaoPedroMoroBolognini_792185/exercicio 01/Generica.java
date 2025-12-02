package exercicio01ca06;
/**
 * @author João Pedro Moro Bolognini
 */
public class Generica <T extends Comparable<T>>{
    private T limInferior;
    private T limSuperior;

    /**
     * O construtor vai receber dois parâmetros, se o "limInferior" for maior que
     * o "limSuperior", causará um erro e retornará mensagem de erro, caso contrario
     * vai atribuir as determinadas derivadas.
     * @param limInferior
     * @param limSuperior 
     */
    public Generica(T limInferior, T limSuperior) {
        try{
           if (limInferior.compareTo(limSuperior) <= 0){
                this.limInferior = limInferior;
                this.limSuperior = limSuperior;
            } else {
                throw new Exception("erro nos limites");
            }
        } catch (Exception exception){
            System.err.println(exception.getMessage());
        }
            
        
    }
    
    /**
     * Caso ocorreu a exceção no construtor, os dois atributos da classe estão nulos
     * e dessa forma não será impresso o intervalo, caso contrário será.
     */
    public void imprimirIntervalo(){
        if (this.limInferior != null & this.limSuperior != null)
            System.out.println("[" + this.limInferior + ", " + this.limSuperior + "]");
    }
}
