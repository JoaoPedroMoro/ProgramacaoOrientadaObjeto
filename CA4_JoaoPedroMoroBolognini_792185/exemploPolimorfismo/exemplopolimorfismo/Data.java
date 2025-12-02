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
public class Data {
    private static final String[] TEXTOMES = {"janeiro", "fevereiro", "março", "abril", 
	  "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", 
	  "dezembro"};
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }
    
    public void mostraData(){
        System.out.print(dia + "/" + mes + "/" + ano);
    }
    public void mostraMesExtenso(){
        System.out.print(TEXTOMES[mes-1]);
    }
}