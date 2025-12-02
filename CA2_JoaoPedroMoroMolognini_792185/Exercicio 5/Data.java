package exercicio05.ca2;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 * @version 1.0
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private char invalida;
    private static final String[] MESES = {"janeiro", "fevereiro", "março", "abril", 
        "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

    public Data(int dia, String nomeMes, int ano) {
        invalida='N';
        this.setDia(dia);
        this.setMes(nomeMes);
        this.setAno(ano);
        if (ano%4==0){
            if (mes == 2){
                if (dia < 0 || dia > 29){
                    System.out.println("Dia inválido");
                    invalida='S';
                }
            } else {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    if (dia < 0 || dia > 31){
                        System.out.println("Dia inválido");
                        invalida='S';
                    }
                } else {
                    if (dia < 0 || dia > 30){
                        System.out.println("Dia inválido.");
                        invalida='S';
                    }
                }
            }
        } else {
            if (mes == 2){
                if (dia < 0 || dia > 28){
                    System.out.println("Dia inválido");
                    invalida='S';
                }
            } else {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    if (dia < 0 || dia > 31){
                        System.out.println("Dia inválido");
                        invalida='S';
                    }
                } else {
                    if (dia < 0 || dia > 30){
                        System.out.println("Dia inválido.");
                        invalida='S';
                    }
                }
            }
        }
        
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
        
    }
    
    public Data() {
        invalida='N';
        this.setDia(0);
        this.setMes(0);
        this.setAno(0);
    }
    
    public void mostraData(){
        if (this.invalida == 'S')
            System.out.println("Data inválida!");
        System.out.println(this.dia + " de " + this.nomeMes() + " de " + this.ano);
    }
    
    public int getDia() {
        return dia;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    
    public void setMes(String mes) {
        this.mes=0;
        for (int i=0; i<12 ;i++){
            if (MESES[i].equals(mes)){
                this.mes =i+1;
            }
        }
        if (this.mes==0){
            invalida='S';
            System.out.println("Mês inválido.");
        }
    }
    
    public void setMes (int mes){
        this.mes=mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String nomeMes(){
        if (mes >= 1 && mes <=12)
            return Data.MESES[mes-1];
        else{
            String erro="mes inválido";
            return erro;
        } 
    }
    
}

