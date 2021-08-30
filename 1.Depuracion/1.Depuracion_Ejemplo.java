import java.util.Scanner;

public class Depuracion_Ejemplo {

    public static int multiplicar(int n1, int n2){
        int resultado = 0;
        for(int i = 0 ; i<n2 ; i++){
            resultado += n1;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        
        float division = a/b ;
        System.out.println("El resultado de la división es: " +
                division);
        
        
        int n1 = 8;
        int n2 = 3;
        n1 = 15;
        int r = multiplicar(n1,n2) ;
        n1 = 300;
        System.out.println("El resultado de"
                + " la multiplicación es: " 
                + r );
        n1 = 8000;
    }
}