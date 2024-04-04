package exercicios.listas_lineares.ex07;

public class ex07 {

    public static void main(String[] args) {
        Fila fila = new Fila(20);
        fila.inserir(10, 5);
        fila.inserir(20, 4);
        fila.inserir(30, 3);
        fila.inserir(40, 2);
        fila.inserir(50, 1);

        fila.mostrarFila();

    }
}
