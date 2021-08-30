public class MiExcepcion extends Exception{
    
    MiExcepcion(){
    }
    
    MiExcepcion(String str){
        super (str);
    }
    
    public void mostrar(){
        System.out.println("Error");
    }
    
}
