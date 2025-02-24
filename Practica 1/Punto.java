public class Punto {
    public float x;
    public float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void coord_cartesianas() {
        System.out.println("Coordenadas Cartesianas: (" + this.x + ", " + this.y + ")");
    }

    public void coord_polares() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        System.out.println("Coordenadas Polares: (r = " + r + ", θ = " + theta + ")");
    }

    @Override
    public String toString() {
        return "Punto(" + "x=" + x + ", y=" + y + ')';
    }

    public static void main(String[] args) {
        Punto punto = new Punto(3, 4);
        punto.coord_cartesianas();
        punto.coord_polares();
        System.out.println(punto);
    }
}