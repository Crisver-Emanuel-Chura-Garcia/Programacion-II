import javax.swing.*;
import java.awt.*;

public class Linea extends JPanel {
    public Punto p1;
    public Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);

        // Dibujar la línea desde p1 hasta p2
        g.drawLine((int) p1.x, (int) p1.y, (int) p2.x, (int) p2.y);
    }

    public static void main(String[] args) {
        // Crear la ventana
        JFrame ventana = new JFrame("Dibujo de Línea");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 500);
        ventana.setLocationRelativeTo(null);

        // Crear los puntos de la línea
        Punto punto1 = new Punto(100, 100);
        Punto punto2 = new Punto(400, 400);
        Linea linea = new Linea(punto1, punto2);

        ventana.add(linea);
        ventana.setVisible(true);
    }
}