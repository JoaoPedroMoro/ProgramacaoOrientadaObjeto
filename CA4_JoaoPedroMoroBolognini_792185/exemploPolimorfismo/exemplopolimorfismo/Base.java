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
public class Base {
    private int x;
    public Base(){
        x=5;
    }
    public int getX(){
        return x;
    }
     
    public void sobreposicao(){
        System.out.println("Método sobreposicao na BASE");
    }
    
    public void sobrecarga(){
        System.out.println("Método sobrecarga na BASE");
    }
    
    public void sobrecargaESobreposicao(){
        System.out.println("Método sobrecargaESobreposicao na BASE");
    }
}
