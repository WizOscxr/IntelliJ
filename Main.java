import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        esPar(numero);

        scanner.close();
    }

    /**
     * Validar si un numero es parell o senar
     *
     * @param numero valor a comprovar 
     */
    public static void esPar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
    }
}
