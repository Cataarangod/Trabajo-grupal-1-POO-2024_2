import java.util.Scanner;
class Ejercicio_14 {
    public static void main(String[] args) {
    float vd1,vd2,vd3,salar;
    double totven,porven,salar1,salar2,salar3;
    Scanner ola = new Scanner(System.in);
    ola.useDelimiter("\r?\n");
    System.out.println("Ingrese importe de ventas del departamento 1:");
    vd1 = ola.nextFloat();
    System.out.println("Ingrese el importe de ventas del departamento 2:");
    vd2 = ola.nextFloat();
    System.out.println("Ingrese el importe de ventas del departamento 3:");
    vd3 = ola.nextFloat();
    System.out.println("Ingrese el salario de los vendedores:");
    salar = ola.nextFloat();
    totven = vd1+vd2+vd3;
    porven = 0.33*totven;
    if (vd1>porven)
    {
        salar1=salar+(0.2*salar);
    }
    else
    {
       salar1=salar;
    }
    if (vd2>porven)
    {
        salar2=salar+(0.2*salar);
    }
    else
    {
       salar2=salar;
    }
    if (vd3>porven)
    {
        salar3=salar+(0.2*salar);
    }
    else
    {
       salar3=salar;
    }
    System.out.println("Salario vendedores dpto.1: $"+salar1+" salario vendedores dpto.2: $"+salar2+" salario vendedores dpto.3: $"+salar3);
    }
}