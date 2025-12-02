public class Triangulo extends FormaBiDimensional {
    
    private float l1; 
    private float l2;
    private float l3;

    public Triangulo(float a, float b, float c){
        super("Triângulo");
        this.l1 = a;
        this.l2 = b;
        this.l3 = c;
    }
    
    @Override
    public float perimetro(){
        return this.l1+this.l2+this.l3;
    }

    @Override
    public float area(){
        float p = this.perimetro()/2;
        return (float) Math.sqrt(p * (p-this.l1) * (p-this.l2) * (p-this.l3));
    }
    
}
