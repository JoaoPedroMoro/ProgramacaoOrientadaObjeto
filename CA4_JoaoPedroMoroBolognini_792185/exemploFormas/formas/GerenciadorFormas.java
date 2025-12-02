import java.util.Scanner;

public class GerenciadorFormas{
    
    private Forma [] vetFormas;
    private int numFormas;

    public GerenciadorFormas(){
        this.vetFormas = new Forma[50];
        this.numFormas = 0;
    }

    public void criaForma(){
        
        if(this.numFormas == 50){
            System.out.println("Caixa de forma lotada!");
            return;
        }

        Scanner ler = new Scanner(System.in);
        int tipo;
        
        System.out.println("1 - Circulo");
        System.out.println("2 - Triangulo");
        System.out.println("3 - Retangulo");
        System.out.println("4 - Esfera");
        // Adicione mais duas

        System.out.println("Qual forma você deseja criar?");
        tipo = ler.nextInt();

        switch (tipo) {
            case 1:
                float raioCirculo;
                System.out.println("Digite o raio do círculo:");
                raioCirculo = ler.nextInt();
                this.vetFormas[this.numFormas] = new Circulo(raioCirculo);
                this.numFormas++;
            break;
    
            case 2:
                float lado1,lado2,lado3;
                System.out.println("Digite o lado 1 do triângulo:");
                lado1 = ler.nextInt();
                System.out.println("Digite o lado 2 do triângulo:");
                lado2 = ler.nextInt();
                System.out.println("Digite o lado 3 do triângulo:");
                lado3 = ler.nextInt();
                this.vetFormas[this.numFormas] = new Triangulo(lado1,lado2,lado3);
                this.numFormas++;
            break;
            case 3:
                float base, altura;
                System.out.println("Digite a base do retângulo:");
                base = ler.nextInt();
                System.out.println("Digite a altura do retângulo");
                altura = ler.nextInt();
                this.vetFormas[this.numFormas] = new Retangulo(base,altura);
                this.numFormas++;
            break;

            case 4:
                float raioEsfera;
                System.out.println("Digite o raio da esfera:");
                raioEsfera = ler.nextInt();
                this.vetFormas[this.numFormas] = new Esfera(raioEsfera);
                this.numFormas++;
            break;
        
            default:
                System.out.println("Entrada inválida");
                break;
        }
    }

    public void mostrarFormas(){
        System.out.println("**********************");
        if(this.numFormas == 0){
            System.out.println("Nenhuma forma foi criada");
            return;
        }
        System.out.println("As formas criadas foram:");
        for(int i = 0; i < this.numFormas; i++){
            System.out.println("----------");
            System.out.println("A forma " + (i+1) + " tem " + this.vetFormas[i].nDimensoes() + " dimensões");
            System.out.println("É um "+ this.vetFormas[i].nomeForma());
            System.out.println("Perímetro: " + this.vetFormas[i].perimetro());
            System.out.println("Área: " + this.vetFormas[i].area());
            System.out.println("Volume: " + this.vetFormas[i].volume());
            System.out.println("----------");
        }
        System.out.println("**********************");
    }
}