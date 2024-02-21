package tad;

public class ValidarCPF {
    public boolean validar(String cpf) {
        if (cpf.length() != 11) {
            return false;
        }
        int[] numeros = new int[11];
        for (int i = 0; i < 11; i++) {
            numeros[i] = Integer.parseInt(cpf.substring(i, i + 1));
        }
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += numeros[i] * (10 - i);
        }
        int resultado = soma % 11;
        if (resultado == 0 || resultado == 1) {
            if (numeros[9] != 0) {
                return false;
            }
        } else {
            if (numeros[9] != 11 - resultado) {
                return false;
            }
        }
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += numeros[i] * (11 - i);
        }
        resultado = soma % 11;
        if (resultado == 0 || resultado == 1) {
            if (numeros[10] != 0) {
                return false;
            }
        } else {
            if (numeros[10] != 11 - resultado) {
                return false;
            }
        }
        return true;
    }
}
