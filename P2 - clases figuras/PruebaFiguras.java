public class PruebaFiguras {
    /**
     * Método main que crea un círculo, un rectángulo, un cuadrado y
     * un triángulo rectángulo. Para cada uno de estas figuras geométricas,
     * se calcula su área y perímetro.
     * Se adiciona lo mismo para un rombo y un trapecio.
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(1, 2);
        Cuadrado cuadrado = new Cuadrado(3);
        TrianguloRectangulo triangulorectangulo = new TrianguloRectangulo(3, 5);
        Rombo rombo = new Rombo(5,8,4);
        Trapecio trapecio = new Trapecio(15,12,6);

        System.out.println("El área del círculo es = " + circulo.calcularArea());
        System.out.println("El perímetro del círculo es = " + circulo.calcularPerimetro());

        System.out.println("\nEl área del rectángulo es = " + rectangulo.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + rectangulo.calcularPerimetro());
        
        System.out.println("\nEl área del cuadrado es = " + cuadrado.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + cuadrado.calcularPerimetro());
        
        System.out.println("\nEl área del triángulo es = " + triangulorectangulo.calcularArea());
        System.out.println("El perímetro del triángulo es = " + triangulorectangulo.calcularPerimetro());
        triangulorectangulo.determinarTipoTriangulo();
        
        System.out.println("\nEl área del rombo es = " + rombo.calcularArea());
        System.out.println("El perímetro del rombo es = " + rombo.calcularPerimetro());
        
        System.out.println("\nEl área de mi trapecio es = " + trapecio.calcularArea());
        System.out.println("El perímetro de mi trapecio es = " + trapecio.calcularPerimetro());
    }
}