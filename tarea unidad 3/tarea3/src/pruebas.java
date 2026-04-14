import java.util.Scanner;

public class pruebas
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Defina el limite para mostrar todos los primos hasta ese numero:");
        int numero_ingresado = teclado.nextInt();

        System.out.println("=== NUMEROS PRIMOS DEL 1 AL " + numero_ingresado + " ===");

        for (int i = 2; i <= numero_ingresado; i++) // ✅ empieza en 2, el 1 no es primo
        {
            boolean esPrimo = true; //cada vez que inicia es verdadero

            for (int j = 2; j < i; j++) // ✅ busca si tiene algún divisor
            {
                if (i % j == 0)         // ✅ si es divisible por j, no es primo
                {
                    esPrimo = false; //saldra del programa tan pronto sea falso
                    break;              // no necesita seguir buscando
                }
            }

            if (esPrimo)
            {
                System.out.println(i);
            }
        }
    }
}
