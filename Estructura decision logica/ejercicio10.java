import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int estrato;
        String nombre, numeroInscripcion;
        double patrimonio, pagoMatricula;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su número de inscripción ");
        numeroInscripcion = entrada.next();
        System.out.print("Ingrese su nombre "); entrada.nextLine();
        nombre = entrada.nextLine();
        System.out.print("Ingrese su patrimonio en pesos colombianos (sin signos, comas ni puntos) ");
        patrimonio = entrada.nextDouble();
        System.out.print("Ingrese su estrato ");
        estrato = entrada.nextInt();

        pagoMatricula = calculoMatricula(estrato, patrimonio);
        System.out.println("El estudiante " + nombre + " con numero de inscripción " + numeroInscripcion +
                " debe pagar: $" + pagoMatricula);
    }

    public static double calculoMatricula(int estrato, double patrimonio){
        return ((patrimonio > 2000000) && (estrato > 3)) ?
                50000 + (0.03*patrimonio) :
                50000;
    }
}