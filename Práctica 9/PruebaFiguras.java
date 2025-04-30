import java.util.Random;

// a) Interfaz Coloreado
interface Coloreado {
    String comoColorear();
}

// b) Clase abstracta Figura
abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        return "Color: " + color;
    }

    public abstract double area();

    public abstract double perimetro();
}

// c) Clase Cuadrado
class Cuadrado extends Figura implements Coloreado {
    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return 4 * lado;
    }

    public String comoColorear() {
        return "Colorear los cuatro lados";
    }

    public String toString() {
        return "Cuadrado - " + super.toString() + ", Lado: " + lado;
    }
}

// d) Clase Circulo
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public String toString() {
        return "Círculo - " + super.toString() + ", Radio: " + radio;
    }
}

// f) Programa de prueba
public class PruebaFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rand = new Random();

        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2) + 1; // 1-Cuadrado, 2-Círculo
            String color = (i % 2 == 0) ? "Rojo" : "Azul";
            if (tipo == 1) {
                double lado = rand.nextInt(10) + 1;
                figuras[i] = new Cuadrado(lado, color);
            } else {
                double radio = rand.nextInt(10) + 1;
                figuras[i] = new Circulo(radio, color);
            }
        }

        for (Figura f : figuras) {
            System.out.println(f.toString());
            System.out.printf("Área: %.2f, Perímetro: %.2f\n", f.area(), f.perimetro());

            if (f instanceof Coloreado) {
                Coloreado c = (Coloreado) f;
                System.out.println("Cómo colorear: " + c.comoColorear());
            }

            System.out.println("---------------");
        }
    }
}
