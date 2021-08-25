import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones_Ejemplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        try {
            n = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Valor introducido no válido");
            n = 0;
            sc.nextLine();
        }
        
        
        float f;
        try {
            f = sc.nextFloat();
        } catch (InputMismatchException imee) {
            System.out.println("Valor flotante introducido no válido");
            f = 0;
        }
        
        
        int n2;
        try {
            n2 = Integer.parseInt("M");
        } catch (Exception e) {
            System.out.println(e);
            sc.nextLine();
        }
        
        int n3;
        try {
            n3 = Integer.parseInt("M");
        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
            sc.nextLine();
        }
        
        
        int num = 5;
        int num2 = 5;
        try {
            num = sc.nextInt();
            num2 = Integer.parseInt(sc.next());
        } catch (InputMismatchException ime) {
            System.out.println("ERROR: " + ime);
            num = 0;
        } catch (NumberFormatException nfe){
            System.out.println("ERROR: " + nfe);
            num2 = -1;
        }
        System.out.println("num1 = " +num + "\nnum2 = " +num2);
        
        
        String miArray [] = null;
        try {
            System.out.println(miArray[4]);
        } catch (NullPointerException npe) {
            System.out.println(npe);
        }
        
        
        String miArray2 [] = new String [10];
        try {
            System.out.println(miArray2[15]);
        } catch (ArrayIndexOutOfBoundsException iobe) {
            System.out.println(iobe);
        }
        
        
        Object i = 42;
        try {
            String s = (String) i;
        } catch (ClassCastException cce) {
            System.out.println(cce);
        }


    }
    
}
