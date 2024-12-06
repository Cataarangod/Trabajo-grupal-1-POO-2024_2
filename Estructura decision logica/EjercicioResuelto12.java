import java.util.Scanner;
public class EjercicioResuelto12 {
	public static void main(String[] args){
        System.out.println("""
            Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas 
            semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden 
            de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando 
            no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo 
            que se paga una hora normal y el resto al triple.
        """);
	String nombre; 
	double vhn,het,hee8,salario;
	int nht;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese nombre: ");
	nombre = entrada.nextLine();
	System.out.println("Ingrese número de horas trabajadas: ");        
	nht = entrada.nextInt();
	System.out.println("Ingrese el salario por hora normal trabajada: ");  
	vhn = entrada.nextDouble();
	
	
	if( nht > 40 ) { 
		het = nht-40; 
		if (het>8) { 
			hee8 = het-8;        
			salario = 40*vhn+16*vhn+hee8*3*vhn; 
			
		}
		else {
			salario=40*vhn+het-2*vhn;
		}
	}
	else {
		salario=nht*vhn;
		
		
	}
	System.out.println("El trabajador "+nombre+" devengó: $"+salario );
	}
}