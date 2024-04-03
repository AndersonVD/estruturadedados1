package listas_duplamente_encadeadas;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.inserirInicio(4);
        lista.inserirFinal(5);
        lista.inserirInicio(6);
        lista.inserirInicio(7);
        System.out.println(lista.mostrarLista());
        lista.removeFinal();
        System.out.println(lista.mostrarLista());
    }
}
