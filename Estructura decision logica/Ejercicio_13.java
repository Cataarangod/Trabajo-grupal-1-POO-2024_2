import java.util.Scanner;
class Ejercicio_13 {
    public static void main(String[] args) {
    float c,p,d;
    Scanner ola = new Scanner(System.in);
    ola.useDelimiter("\r?\n");
    System.out.println("Ingrese el valor de la compra:");
    c = ola.nextFloat();
    System.out.println("Ingrese el color de la bolita:");
    String b = ola.next();
    if ( b.equals("Blanco") || b.equals("blanco"))
    {
        d=0;
    }
    else
    {
        if ( b.equals("Verde") || b.equals("verde"))
        {
            d=10;
        }
        else
        {
            if ( b.equals("Amarillo") || b.equals("amarillo"))
            {
                d=25;
            }
            else
            {
                if ( b.equals("Azul") || b.equals("azul"))
                {
                    d=50;
                }
                else
                {
                    d=100;
                }
            }
        }
    }
    p = c-(d*c/100);
    System.out.println("El cliente debe pagar: $"+p);
    }
}