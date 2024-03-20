package listas_lineares;

public class TesteListaCircular {

    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        lista.inserirInicio(8);
        lista.inserirInicio(5);
        lista.inserirInicio(4);
        System.out.println(lista.mostrarLista());
        // lista.deleteComValor(5);
        System.out.println("Posição do valor " + lista.buscaValorCircular(8));
        System.out.println(lista.mostrarLista());

    }

}