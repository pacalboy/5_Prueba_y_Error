public class Main {
    
    public static float dividir(float n1, float n2)throws MiExcepcion{
    
    if (n2 == 0){
        throw new MiExcepcion();
    }else if (n2 == 1.0f){
        throw new MiExcepcion("Te da lo mismo");
    }else{
        float resultado;
        resultado = (float) n1/n2;
        return resultado;
    }
    
}

    public static void main(String[] args) {
        
        try {
            System.out.println(dividir(6.5f, 0.0f));
        } catch (MiExcepcion e) {
            System.out.println(e);
            e.mostrar();
        }
        
        try {
            System.out.println(dividir(6.5f, 1));
        } catch (MiExcepcion e) {
            System.out.println(e);
            e.mostrar();
        }
        
    } 
    
}
