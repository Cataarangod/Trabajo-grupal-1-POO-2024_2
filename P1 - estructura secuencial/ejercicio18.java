import java.util.Scanner;

class Ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String codigoEmpleado, nombre;
        double cantidadHorasTrabajadasMes, valorHora, porcentajeReteFuente, salarioBruto, salarioNeto;
        System.out.print("Ingresa el código del empleado ");
        codigoEmpleado = entrada.next();
        System.out.print("Ingresa los nombres del empleado ");   entrada.nextLine();
        nombre = entrada.nextLine();
        System.out.print("Ingresa las horas trabajadas en el mes ");
        cantidadHorasTrabajadasMes = entrada.nextDouble();
        System.out.print("Ingresa el valor de la hora de trabajo ");
        valorHora = entrada.nextDouble();
        System.out.print("Ingresa el porcentaje de retención en la fuente (el valor ingresado debe ser mayor a 1) ");
        porcentajeReteFuente = entrada.nextDouble() / 100;

        salarioBruto = calcularSalarioBruto(cantidadHorasTrabajadasMes, valorHora);
        salarioNeto = calcularSalarioNeto(salarioBruto, porcentajeReteFuente);

        System.out.println("\nEl empleado " +nombre + " identificado con código" + codigoEmpleado +
                " registró " + cantidadHorasTrabajadasMes + " horas durante el mes, "
                + "por lo que su salario bruto fue $" + salarioBruto + " y su salario neto fue de $" + salarioNeto);
    }

    public static double calcularSalarioBruto(double horasTrabajadas, double valorHora) {
        return horasTrabajadas * valorHora;
    }

    public static double calcularSalarioNeto(double salarioBruto, double porcentajeReteFuente) {
        return salarioBruto - (salarioBruto * porcentajeReteFuente);
    }
}