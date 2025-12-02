public class Esfera extends FormaTriDimensional{
    private float raio;

    public Esfera(float r){
        super("Esfera");
        this.raio = r;
    }

    @Override
    public float area(){
        return (float) 4 * pi * this.raio * this.raio;
    }

    @Override
    public float volume(){
        return (float) 4/3 * pi * this.raio * this.raio * this.raio;
    }
}
