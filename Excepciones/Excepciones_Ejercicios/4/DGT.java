import java.util.Scanner;

public class DGT {
    
    public static void multar(CarnetDeConducir c, Scanner teclado) {
        System.out.println("Introduce la penalización:");
        int penalizacion = teclado.nextInt();
        
        try {
            c.quitarPuntos(penalizacion);

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
