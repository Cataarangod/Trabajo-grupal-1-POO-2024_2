import java.util.Scanner;

class Ejercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B, C, perimetro, Sp, area; // Lados A, B y C, perímetro, area y semiperímetro
        System.out.print("Ingrese el tamaño del lado: ");
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        perimetro = calcularPerimetro(A, B, C);
        Sp = perimetro / 2;
        area = calcularArea(A, B, C, Sp);

        System.out.println("\nEl perímetro es de " + perimetro + ", el semiperímetro " + Sp +
                " y área es de " + area);

    }

    public static double calcularPerimetro(double a, double b, double c) {
        return a + b + c;
    }

    public static double calcularArea(double a, double b, double c, double sp) {
        return Math.pow((sp * (sp - a) * (sp - b) * (sp * c)), 0.5);
    }
}