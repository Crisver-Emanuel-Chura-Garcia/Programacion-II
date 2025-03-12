class FiguraGeometrica {
    // sobrecarga de metodos(funciones):
    // mismo metodo pero con diferentes parametros establecidos en la clase
    double area(double radio) {
        return Math.PI * radio * radio; // circulo
    }

    double area(float base, double altura) {
        return base * altura; // Rectangulo
    }

    double area(float base, float altura) {
        return ((base * altura) / 2); // triangulo rectángulo
    }

    double area(double base1, double base2, double altura) {
        return (base1 + base2) * (altura / 2); // trapecio
    }

    double area(double lado, double apotema) {
        return (3 * lado * apotema); // hexagono
    }

    public static void main(String[] args) {
        FiguraGeometrica f1 = new FiguraGeometrica();
        FiguraGeometrica f2 = new FiguraGeometrica();
        System.out.println("RESULTADOS:");
        System.out.println("Area del circulo: " + f1.area(1));
        System.out.println("Area del rectangulo: " + f2.area(2, 3));
        // Agregar 2 figuras(triangulo rectangulo, trapecio, hexagono) y que muestren su
        // area
        FiguraGeometrica f3 = new FiguraGeometrica();
        FiguraGeometrica f4 = new FiguraGeometrica();
        FiguraGeometrica f5 = new FiguraGeometrica();
        System.out.println(
                "RESULTADOS: Agregar 2 figuras(triangulo rectangulo, trapecio, hexagono) y que muestren su area");
        System.out.println("Area del triangulo rectangulo: " + f3.area(5, 5));
        System.out.println("Area del trapecio: " + f4.area(5, 3, 2));
        System.out.println("Area del hexagono: " + f5.area(8, 4));
    }
}