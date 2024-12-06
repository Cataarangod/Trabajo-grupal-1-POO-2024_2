import java.util.*;

class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado, perimetro, altura, area;
        System.out.print("Ingrese el tamaño del lado del triángulo equilatero ");
        lado = entrada.nextDouble();
        perimetro = calculaPerimetro(lado);
        altura = calculaAltura(lado);
        area = calculaArea(lado);

        System.out.println("El perimetro es " + perimetro + ", la altura es " + altura + " y área es " + area);

    }

    public static double calculaPerimetro(double lado) {
        return lado * 3;
    }

    public static double calculaAltura(double lado) {
        return (Math.sqrt(3)*lado) / 2;
    }

    public static  double calculaArea(double lado){
        return (Math.sqrt(3)*(lado*lado)) / 4;
    }
}