class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = (int) (Math.random() * 11);
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (numeroDeVidas > 0) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento = scanner.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("¡Número fuera de rango! Intenta de nuevo.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                System.out.println("Incorrecto.");
                if (quitaVida()) {
                    String pista = intento < numeroAAdivinar ? "mayor" : "menor";
                    System.out.println("El número a adivinar es " + pista + ". Intenta de nuevo.");
                } else {
                    System.out.println("No te quedan más vidas. Fin del juego.");
                }
            }
        }
    }
}
