public abstract class FormaBiDimensional extends Forma{
    
    public FormaBiDimensional(String nome){
        super(2, nome);
    }

    abstract public float area();
    abstract public float perimetro();
    public float volume(){
        System.out.println("Volume não definido para formas planas");
        return 0;
    }
    
}
