import java.util.Scanner;
public class Ejercicio_24 {
    public static void main(String[]args){
        float a,b,c,m;
        Scanner ola = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A:");
        a = ola.nextFloat();
        System.out.println("Ingrese el peso de la esfera B:");
        b = ola.nextFloat();
        System.out.println("Ingrese el peso de la esfera C:");
        c = ola.nextFloat();
        if (a>b && a>c)
        {
            m = a;
        }
        else
        {
            if (b>c)
            {
                m = b;
            }
            else
            {
                m = c;
            }
        }
        System.out.println("La esfera con mayor peso entre "+a+", "+b+ " y "+c+ " es: " +m);
    }
}