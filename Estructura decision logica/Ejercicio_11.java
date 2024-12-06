import java.util.Scanner;
class Ejercicio_11 {
    public static void main(String[] args) {
    int n1, n2, n3,m;
    Scanner ola = new Scanner(System.in);
    System.out.println("Ingrese el primer numero");
    n1 = ola.nextInt();
    System.out.println("Ingrese el segundo numero");
    n2 = ola.nextInt();
    System.out.println("Ingrese el tercer numero");
    n3 = ola.nextInt();
    if (n1>n2 && n1>n3)
    {
        m = n1;
    }
    else
    {
        if (n2>n3)
        {
            m = n2;
        }
        else
        {
            m = n3;
        }
    }
    System.out.println("El valor mayor entre: "+n1+", "+n2+ " y "+n3+ " es: " +m);
    }
}