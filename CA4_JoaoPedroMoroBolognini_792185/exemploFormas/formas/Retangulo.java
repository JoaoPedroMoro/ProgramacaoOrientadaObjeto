public class Retangulo extends FormaBiDimensional {
    private float base;
    private float altura;

    public Retangulo(float b, float h){
        super("Retangulo");
        this.base = b;
        this.altura = h;
    }

    @Override
    public float perimetro(){
        return 2*this.base + 2*this.altura;
    }

    @Override
    public float area(){
        return this.base * this.altura;
    }

}
