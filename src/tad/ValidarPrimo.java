package tad;

public class ValidarPrimo {
    private int numero = 0;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ValidarPrimo(int numero) {
        this.numero = numero;
    }

    public boolean validar() {
        if (numero == 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
