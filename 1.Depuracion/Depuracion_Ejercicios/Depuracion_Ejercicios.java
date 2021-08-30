import java.util.Scanner;

public class Depuracion_Ejercicios {

    public static String generaCadena(int a, int b) {
        String cadena = "";
        for (int i = a; i < b; i++) {
            cadena += String.valueOf(i);
        }
        return cadena;
    }

    public static void main(String[] args) {
        /**
         * Introduce los valores 6 y 10 En tiempo de ejecución sustituye el
         * primer número por el valor 0 antes de entrar en el bucle for. Además,
         * durante el bucle, tras generar el valor 4, provoca un cambio en la
         * variable i y ponla con el valor 8. Continúa la ejecución hasta el
         * final. El resultado debe ser "012389" Crea un punto de ruptura
         * condicional para cuando la variable i tenga el valor 9. Haz captura
         * de las variables en ese instante
         */
        Scanner sc = new Scanner(System.in);

        int c, d, e, f, g, h, j, k, l, m, n, p, o, q, r, s, t, u, v, w, x, y, z;
        c = d = e = f = g = h = j = k = l = m = n = o = p = q = r = s = t = u = v = w = x = y = z = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a
                + "\nb = " + b);

        String mensaje = generaCadena(a, b);

        System.out.println("Cadena generada: " + mensaje);

        //---------------------------------------
        /**
         * En tiempo de ejecución hacer que únicamente se imprima la cadena
         * "Hola" 3 veces Haz captura de pantalla de la salida por consola, que
         * se vea tu código
         */
        boolean seguir = true;
        while (seguir) {
            System.out.println("Hola");
        }

        //---------------------------------------
        /**
         * Hacer que en tiempo de ejecución se imprima "Número 3" Haz captura de
         * las variables antes de imprimir el mensaje por consola.
         */
        String msg;
        int i = 0;
        if (i == 0) {
            msg = "Número 0";
        } else if (i == 3) {
            msg = "Número 3";
        } else {
            msg = "Otro número";
        }
        System.out.println(msg);
      
    }

}
