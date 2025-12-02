package exercicio07.ca2;

public class Mensagem {
    private String mensagem;

    public Mensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public Mensagem() {
        this.mensagem = "default";
    }
    public void Mostra(){
        System.out.println("Mensagem armazenada é " + this.mensagem + ".");
    }
    public void Mostra(String mensagem){
        System.out.println("Mensagem armazenada é " + this.mensagem + " e a mensagem do parâmetro é " + mensagem + ".");
    }
}
