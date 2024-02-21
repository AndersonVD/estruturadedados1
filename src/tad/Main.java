package tad;

public class Main {
    public static void main(String[] args) {
        ValidarCPF cpf = new ValidarCPF();
        String cpfBody = "12345678909";
        boolean resultadoValidado = cpf.validar(cpfBody);
        System.out.println(resultadoValidado);

        ValidarPrimo primoValidade = new ValidarPrimo(12);
        System.out.println(primoValidade.validar());

    }
}
