import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesEjercicios {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        /**
         * 0. Nuestro programa va a calcular el cociente de 36 entre un 
         * número que introduzca el usuario. Lee un denominador por teclado, 
         * gestionando todas las excepciones posibles.
         */
        
        int dividendo = 36;
        int divisor = 0;
        System.out.println("Introduce un divisor");
        
        int resultado = 0;
        try {
            divisor = scan.nextInt();
            resultado = dividendo/divisor;
            
        } catch (InputMismatchException ime) {
            System.out.println(ime);
            divisor = 1;
            System.out.println("ERROR 101");
        } catch (ArithmeticException ae){
            System.out.println(ae);
            divisor = 1;
            System.out.println("ERROR 202");
        }
        
        System.out.println(resultado);
        
        
    }
    
}
