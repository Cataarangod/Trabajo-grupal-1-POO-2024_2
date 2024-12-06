import java.util.Scanner;
class Ejercicio_15 {
    public static void main(String[] args) {
    double pesoa,pesob,pesoc,pesod;
    Scanner ola = new Scanner(System.in);
    ola.useDelimiter("\r?\n");
    System.out.println("Ingrese el peso de la bola A:");
    pesoa = ola.nextFloat();
    System.out.println("Ingrese el peso de la bola B:");
    pesob = ola.nextFloat();
    System.out.println("Ingrese el peso de la bola C:");
    pesoc = ola.nextFloat();
    System.out.println("Ingrese el peso de la bola D:");
    pesod = ola.nextFloat();
    if (pesoa==pesob && pesoa==pesoc)
    {
        System.out.println("La esfera D es la diferente y ");
        if (pesod>pesoa)
        {
            System.out.println("es de mayor peso.");
        }
        else{
            System.out.println("es de menor peso.");
        }
    }
    else
    {
        if (pesoa==pesob && pesoa==pesod)
        {
            System.out.println("La esfera C es la diferente y ");
            if (pesoc>pesoa)
            {
            System.out.println("es de mayor peso.");
            }
            else{
            System.out.println("es de menor peso.");
            }
        }
        else{
            if (pesoa==pesod && pesoa==pesoc)
            {
                System.out.println("La esfera B es la diferente y ");
                if (pesob<pesoa)
                {
                    System.out.println("es de mayor peso.");
                }
                else{
                    System.out.println("es de menor peso.");
                }
            }
            else{
                System.out.println("La esfera A es la diferente y ");
                if (pesob<pesoa)
                {
                    System.out.println("es de mayor peso.");
                }
                else{
                    System.out.println("es de menor peso.");
                }
            }
        }
    }
    }
}