import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
       double A, B;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor numérico A ");
        A = entrada.nextDouble();
        System.out.print("Ingrese el valor numérico B ");
        B = entrada.nextDouble();

        if (A > B) {
            System.out.println("\nA es mayor que B");
        }
        else if (A == B) {
            System.out.println("\nA es igual a B");
        }
        else {
            System.out.println("\nA es menor que B");
        }
    }
}