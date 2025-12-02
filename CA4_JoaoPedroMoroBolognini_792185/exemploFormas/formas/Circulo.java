public class Circulo extends FormaBiDimensional {
    private float raio;

    public Circulo (float r){
        super("Circulo");
        this.raio = r;
    }

    @Override
    public float perimetro(){
        return 2 * pi * this.raio;
    }

    @Override
    public float area(){
        return pi * this.raio * this.raio;
    }
}
