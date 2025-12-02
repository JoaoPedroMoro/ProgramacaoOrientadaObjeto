public abstract class FormaTriDimensional extends Forma {
    
    public FormaTriDimensional(String nome){
        super(3,nome);
    }

    abstract public float area();
    abstract public float volume();

    public float perimetro(){
        System.out.println("Perímetro não definido para formas tridimensionais");
        return 0;
    }
}
