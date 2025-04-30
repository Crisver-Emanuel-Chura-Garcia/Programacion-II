import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

abstract class Boleto {
    protected int numero;
    protected double precio;

    public Boleto(int numero) {
        this.numero = numero;
    }

    public abstract String mostrarInfo();
}

class Palco extends Boleto {
    public Palco(int numero) {
        super(numero);
        this.precio = 100.0;
    }

    public String mostrarInfo() {
        return "Número: " + numero + ", Precio: " + precio;
    }
}

class Platea extends Boleto {
    public Platea(int numero, int diasAnticipacion) {
        super(numero);
        if (diasAnticipacion >= 10)
            this.precio = 50.0;
        else
            this.precio = 60.0;
    }

    public String mostrarInfo() {
        return "Número: " + numero + ", Precio: " + precio;
    }
}

class Galeria extends Boleto {
    public Galeria(int numero, int diasAnticipacion) {
        super(numero);
        if (diasAnticipacion >= 10)
            this.precio = 25.0;
        else
            this.precio = 30.0;
    }

    public String mostrarInfo() {
        return "Número: " + numero + ", Precio: " + precio;
    }
}

public class TeatroGUI extends JFrame implements ActionListener {
    private JRadioButton rbPalco, rbPlatea, rbGaleria;
    private JTextField tfNumero, tfDias;
    private JButton btnVende, btnSalir;
    private JLabel lblInfo;

    public TeatroGUI() {
        setTitle("Teatro Municipal");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        // --- Título con imagen a la derecha ---
        JPanel tituloPanel = new JPanel(new BorderLayout());
        JLabel lblTitulo = new JLabel("Teatro Municipal", JLabel.CENTER);
        lblTitulo.setFont(new Font("Serif", Font.BOLD, 24));
        tituloPanel.add(lblTitulo, BorderLayout.CENTER);

        // Imagen simulada
        try {
            ImageIcon icon = new ImageIcon("teatro.jpg"); // Cambia si tienes otra ruta
            Image img = icon.getImage().getScaledInstance(100, 80, Image.SCALE_SMOOTH);
            tituloPanel.add(new JLabel(new ImageIcon(img)), BorderLayout.EAST);
        } catch (Exception e) {
            tituloPanel.add(new JLabel(""), BorderLayout.EAST);
        }

        add(tituloPanel, BorderLayout.NORTH);

        // --- Panel central con opciones ---
        JPanel centroPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        centroPanel.setBorder(BorderFactory.createTitledBorder("Datos del Boleto"));

        rbPalco = new JRadioButton("Palco", true);
        rbPlatea = new JRadioButton("Platea");
        rbGaleria = new JRadioButton("Galería");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbPalco);
        grupo.add(rbPlatea);
        grupo.add(rbGaleria);

        JPanel tipoPanel = new JPanel(new FlowLayout());
        tipoPanel.add(rbPalco);
        tipoPanel.add(rbPlatea);
        tipoPanel.add(rbGaleria);

        centroPanel.add(new JLabel("Tipo de Entrada:"));
        centroPanel.add(tipoPanel);

        centroPanel.add(new JLabel("Número:"));
        tfNumero = new JTextField("1");
        centroPanel.add(tfNumero);

        centroPanel.add(new JLabel("Cant. Días para el Evento:"));
        tfDias = new JTextField();
        centroPanel.add(tfDias);

        btnVende = new JButton("Vende");
        btnSalir = new JButton("Salir");

        centroPanel.add(btnVende);
        centroPanel.add(btnSalir);

        add(centroPanel, BorderLayout.CENTER);

        // --- Panel inferior para mostrar información ---
        JPanel infoPanel = new JPanel();
        lblInfo = new JLabel("Información");
        lblInfo.setFont(new Font("Arial", Font.BOLD, 16));
        lblInfo.setForeground(Color.BLUE);
        infoPanel.add(lblInfo);
        add(infoPanel, BorderLayout.SOUTH);

        // Eventos
        btnVende.addActionListener(this);
        btnSalir.addActionListener(e -> System.exit(0));
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int numero = Integer.parseInt(tfNumero.getText());
            int dias = tfDias.getText().isEmpty() ? 0 : Integer.parseInt(tfDias.getText());
            Boleto boleto;

            if (rbPalco.isSelected()) {
                boleto = new Palco(numero);
            } else if (rbPlatea.isSelected()) {
                boleto = new Platea(numero, dias);
            } else {
                boleto = new Galeria(numero, dias);
            }

            lblInfo.setText(boleto.mostrarInfo());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TeatroGUI().setVisible(true));
    }
}
