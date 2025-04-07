class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero % 2 == 0 || numero < 0 || numero > 10) {
            System.out.println("¡Error! El número debe ser impar y estar entre 0 y 10.");
            return false;
        }
        return true;
    }
}
