/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopolimorfismo;

/**
 *
 * @author katti
 */
public class ExemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
/* Atribuir uma referência da Base a uma variável de Base é simples e direto.
   O objeto só tem os atributos e métodos de Base.
*/        
        Base oBase = new Base();
        System.out.println("Execução a partir de oBase");
        oBase.sobrecarga();
        oBase.sobreposicao();
        oBase.sobrecargaESobreposicao();
        
/* Atribuir uma referência de Derivada a uma variável de Derivada é simples e direto.
   O objeto tem os atributos e métodos de Derivada e todos os herdados de Base, podendo
   inclusive, sobrepor e/ou sobrescrever os métodos de Base.
*/
        Derivada oDerivada = new Derivada();
        System.out.println("Execução a partir de oDerivada");     
        oDerivada.sobrecarga(); 
        oDerivada.sobrecarga(10);
        oDerivada.sobreposicao();
        oDerivada.sobrecargaESobreposicao();
        oDerivada.sobrecargaESobreposicao(5);
        
/* Atribuir uma referência de Derivada a uma variável de Base é seguro (upcasting), 
   porque o objeto  de Derivada é um objeto de sua Base.
   A variável da Base, porém, pode ser utilizada para referenciar apenas membros da Base.
   Se há sobreposição de um método, a versão da Derivada é executada, decisão que é feita
   em tempo de execução (ligação dinâmica. 
   Se o código referencia métodos exclusivos da Derivada (não há interface para esse método
   na Base) por meio da variável de Base, o compilador informa erros.
*/
        System.out.println("Execução a partir de oBaseDerivada");
        // referencia do tipo Base referenciando objeto de Derivada (upcasting)
        Base oBaseDerivada = oDerivada; 
        
        oBaseDerivada.sobrecarga(); 
        //oBaseDerivada.sobrecarga(10); // versão que só existe na derivada, 
                                        // não pode ser acessado a partir de variável da Base
        oBaseDerivada.sobreposicao();
        oBaseDerivada.sobrecargaESobreposicao();
        //oBaseDerivada.sobrecargaESobreposicao(5); // versão que só existe na derivada, 
                                        // não pode ser acessado a partir de variável da Base
 
 /* Tentar atribuir uma referência de Base a uma variável de Derivada é um erro de compilação. 
    Para evitar esse erro, a referência de Base deve sofrer uma coerção explícita para 
    um tipo de Derivada. Em tempo de execução, se o objeto referenciado não for um
    objeto de Derivada, ocorrerá uma exceção. 
    Utilizar o operador instanceof para assegurar que tal coerção seja realizada somente 
    se o objeto for um objeto de Derivada.
*/
 
        System.out.println("Execução a partir de oDerivadaBase");
        // referencia do tipo Derivada referenciando objeto de Base --- não faz sentido e é erro de compimação
        // Derivada oDerivadaBase = oBase; 
        
        // Entretanto, se referencia da Base referenciar objeto da Derivada, podemos fazer de volta a conversão,
        // mas explicitamente (downcasting). Isso só deve ser feito em contextos bem específicos e com cautela.
        
        Derivada oDerivadaBase;
        if (oBaseDerivada instanceof Derivada){
            oDerivadaBase = (Derivada) oBaseDerivada; // oBaseDerivada no exemplo anterior era do tipo Base, 
                                                // mas referenciava objeto da Derivada. É importante garantir
                                                // que o tipo de objeto referenciado por oBaseDerivada seja Derivada
                                                // para que não ocorra erro na conversão. 
                                                // Por isso o teste de instanceof
            // se a conversão for bem sucedida, podemos acessar todos os métodos da derivada normalmente                                    
            oDerivadaBase.sobrecarga(); 
            oDerivadaBase.sobrecarga(10); // versão que só existe na derivada, 
                                        // não pode ser acessado a partir de variável da Base, 
                                        // mas agora com a conversão de volta para a Derivada, é possível
            oDerivadaBase.sobreposicao();
            oDerivadaBase.sobrecargaESobreposicao();
            oDerivadaBase.sobrecargaESobreposicao(5); // versão que só existe na derivada, 
                                        // não pode ser acessado a partir de variável da Base
                                        // mas agora com a conversão de volta para a Derivada, é possível
        }
 
 
// Exemplo de chamada de método que tem como parâmetro o tipo Base, mas com chamada feita de diversas maneiras
        testaSobreposição(oBase);
        testaSobreposição(oDerivada);
        testaSobreposição(oBaseDerivada);
        
    }
    
    
    public static void testaSobreposição(Base pBase){
        System.out.println("testaSobreposicao");
        pBase.sobreposicao(); // com upcasting + ligação dinâmica, o método sobreposição da classe do objeto real
                              // a que pBase se refere é que vai ser chamado
    }
    
}
