package exercicios.listas_lineares.ex01;

public class ex01 {
    public void mediaNumerica(ListaEncadeada listaEncadeada, int dado) {
        int totalNodos = 0;
        int nodosComValor = 0;
        int nodosComValorMaior = 0;
        int posicao = 0;

        // inserir Nodos
        listaEncadeada.inserirInicio(25);
        listaEncadeada.inserirInicio(25);
        listaEncadeada.inserirInicio(25);
        listaEncadeada.inserirInicio(25);
        for (int i = 0; i < 100; i++) {
            listaEncadeada.inserirInicio(i);
        }

        Nodo aux = listaEncadeada.getInicio();

        while (aux != null) {
            totalNodos++;

            if (aux.getDado() == dado) {
                nodosComValor++;
                System.out.println("Nodo com valor " + dado + " encontrado na posição " + posicao);
            }

            if (aux.getDado() > dado) {
                nodosComValorMaior++;
            }

            aux = aux.getProx();
            posicao++;
        }

        System.out.println("Número total de nodos da lista: " + totalNodos);
        System.out.println("Número de nodos com valor " + dado + ": " + nodosComValor);
        System.out.println("Número de nodos com valor maior que " + dado + ": " + nodosComValorMaior);

    }

    public static void main(String[] args) {
        ex01 ex01 = new ex01();
        ListaEncadeada listaEncadeada = new ListaEncadeada();
        ex01.mediaNumerica(listaEncadeada, 25);

    }
}