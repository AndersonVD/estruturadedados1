package exercicios.listas_lineares.ex06;

public class ex06 {

    public ListaCircular combinarListas(ListaCircular lista1, ListaCircular lista2) {
        ListaCircular combinada = new ListaCircular();
        Nodo atual = lista1.getinicio();
        // Insere todos os elementos da primeira lista na lista combinada
        do {
            combinada.inserirOrdenado(atual.getDado());
            atual = atual.getProx();
        } while (atual != lista1.getinicio());

        atual = lista2.getinicio();
        // Insere todos os elementos da segunda lista na lista combinada
        do {
            combinada.inserirOrdenado(atual.getDado());
            atual = atual.getProx();
        } while (atual != lista2.getinicio());

        return combinada;
    }

    public static void main(String[] args) {
        ex06 ex = new ex06();
        ListaCircular lista1 = new ListaCircular();
        ListaCircular lista2 = new ListaCircular();

        lista1.inserirOrdenado(11);
        lista1.inserirOrdenado(5);
        lista1.inserirOrdenado(2);
        lista1.inserirOrdenado(7);
        lista1.inserirOrdenado(18);

        lista2.inserirOrdenado(2);
        lista2.inserirOrdenado(4);
        lista2.inserirOrdenado(6);
        lista2.inserirOrdenado(8);
        lista2.inserirOrdenado(10);

        ListaCircular listaCombinada = ex.combinarListas(lista1, lista2);
        System.out.println(listaCombinada.mostrarLista());
    }
}
