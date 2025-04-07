public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

        System.out.println("Juego 1: Adivina el número.");
        juego1.juega();

        System.out.println("Juego 2: Adivina el número par.");
        juego2.juega();

        System.out.println("Juego 3: Adivina el número impar.");
        juego3.juega();
    }
}
