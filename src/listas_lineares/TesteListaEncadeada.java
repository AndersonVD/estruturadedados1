package listas_lineares;

public class TesteListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // Testando o método inserir, ele sempre incrementa no inicio da lista
        // lista.inserirInicio(4);
        lista.inserirFinal(10);
        lista.inserirFinal(5);
        lista.inserirFinal(6);
        lista.inserirFinal(7);
        lista.inserirFinal(8);
        lista.inserirFinal(9);
        lista.inserirFinal(11);
        // lista.inserirInicio(12);
        // lista.contarNodos();
        // lista.deletarUltimo();
        lista.pegarPosicaoDado(11);

        lista.mostrarLista();
        // lista.contarNodos();
    }
}
