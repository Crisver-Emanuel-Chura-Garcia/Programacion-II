import javax.swing.*;
import java.awt.*;

public class Circulo extends JPanel {
    public Punto centro;
    public float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);

        // Convertir coordenadas del centro para que se dibuje correctamente en el
        // JPanel
        int x = (int) (centro.x - radio);
        int y = (int) (centro.y - radio);
        int diametro = (int) (radio * 2);

        g.drawOval(x, y, diametro, diametro); // Dibuja el contorno del círculo
    }

    public static void main(String[] args) {
        // Crear la ventana
        JFrame ventana = new JFrame("Dibujo de Círculo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 500);
        ventana.setLocationRelativeTo(null);

        // Crear el círculo con un centro y radio específico
        Punto centro = new Punto(250, 250); // Centro en la mitad de la ventana
        Circulo circulo = new Circulo(centro, 100);

        ventana.add(circulo);
        ventana.setVisible(true);
    }
}