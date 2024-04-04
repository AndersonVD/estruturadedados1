package exercicios.listas_lineares.ex08;

public class ex08 {

    public static void separarParesEImpares(Fila f, Fila fPares, Fila fImpares) {
        while (!f.vazia()) {
            int valor = f.remover();
            if (valor % 2 == 0) {
                fPares.inserir(valor);
            } else {
                fImpares.inserir(valor);
            }
        }

        System.out.println("Fila F_Pares:");
        fPares.mostrarFila();
        System.out.println("Fila F_Impares:");
        fImpares.mostrarFila();

    }

    public static void main(String[] args) {
        Fila f = new Fila(10);
        Fila fPares = new Fila(10);
        Fila fImpares = new Fila(10);

        f.inserir(1);
        f.inserir(2);
        f.inserir(3);
        f.inserir(4);
        f.inserir(5);
        f.inserir(6);
        f.inserir(7);
        f.inserir(8);
        f.inserir(9);
        f.inserir(10);

        separarParesEImpares(f, fPares, fImpares);
    }

}
