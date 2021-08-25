public class MiPrimeraExcepcion extends Exception{

    public MiPrimeraExcepcion() {
    }
    
    MiPrimeraExcepcion (String msg){
        super(msg);
    }
    
    public void mostrarCodigo(){
        System.out.println("CODIGO");
    }
    
}
