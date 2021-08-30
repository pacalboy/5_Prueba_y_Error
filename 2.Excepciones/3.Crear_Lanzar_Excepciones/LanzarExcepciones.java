import java.util.Scanner;

public class LanzarExcepciones {

    public static float calcularDivision(int n1, int n2) throws MiPrimeraExcepcion {
        if (n2 == 0) {
            throw new MiPrimeraExcepcion("Divisor no puede ser 0!!!");
        } else{
            float r;
            r = (float) n1/n2;
            return r;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        float resultado;
        try {
            resultado = calcularDivision(a, b);
            System.out.println("El resultado es: " + resultado);

        } catch (MiPrimeraExcepcion mpe) {
            mpe.mostrarCodigo();
            System.out.println(mpe);
        }
        
    }
    
}
