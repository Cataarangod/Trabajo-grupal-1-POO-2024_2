import java.util.Scanner;
class Ejercicio_22 {
    public static void main(String[] args) {
    float salh,ht,sal;
    Scanner ola = new Scanner(System.in);
    ola.useDelimiter("\r?\n");
    System.out.println("Ingrese el nombre del trabajador:");
    String no = ola.next();
    System.out.println("Ingrese el numero de horas trabajadas:");
    ht = ola.nextFloat();
    System.out.println("Ingrese el valor de horas normalmente:");
    salh = ola.nextFloat();
    sal=ht*salh;
    if (sal>450000)
    {
        System.out.println("La persona "+no+" tiene un salario de: $"+sal);
    }
    else
    {
        System.out.println(no);
    }
    }
}