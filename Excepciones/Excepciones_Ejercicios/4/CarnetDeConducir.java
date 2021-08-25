public class CarnetDeConducir implements CarnetPorPuntos{
    protected String nombre; 
    protected int puntos;
    
    public CarnetDeConducir(String nombre ) {
        this.nombre=nombre; 
        puntos = 12;
    }
    
    @Override
    public String toString( ) { 
        return nombre + " (" + puntos + " puntos" + ")"; 
    }
    
    public final String getNombre( ) {
        return nombre; 
    }
    
    @Override
    public void quitarPuntos ( int penalizacion ) throws RetiradaInmediataCarnet {
        puntos -= penalizacion; 
        if (puntos <= 0) {
            throw new RetiradaInmediataCarnet();
        } 
    }
}
