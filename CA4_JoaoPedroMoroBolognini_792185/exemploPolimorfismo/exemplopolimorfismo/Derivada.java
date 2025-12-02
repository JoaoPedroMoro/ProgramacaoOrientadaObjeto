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
class Derivada extends Base {
    @Override
    public void sobreposicao(){
        System.out.println("Método sobreposicao na DERIVADA");
    }
    
    public void sobrecarga(int p){
        System.out.print("Método sobrecarga na DERIVADA --- ");
        System.out.println("Versão com parametro " + p);
    }
    
    @Override
    public void sobrecargaESobreposicao(){
        System.out.println("Método sobrecargaESobreposicao na DERIVADA (versão sobreposta)");
    }
    public void sobrecargaESobreposicao(int p){
        System.out.print("Método sobrecargaESobreposicao na DERIVADA (versão sobrecarregada) --- ");
        System.out.println("Versão com parametro " + p);
    }
}
