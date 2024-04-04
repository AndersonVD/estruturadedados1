package exercicios.listas_lineares.ex04;

public class ex04 {
    // Uma maneira usual de representar conjuntos é listando seus elementos.
    // Desenvolva uma aplicação que ofereça as operações usuais de conjuntos (união,
    // intersecção e diferença), considerando que cada um dos conjuntos é
    // representado por uma lista encadeada
    Nodo inicio;

    // Operação de união entre dois conjuntos
    public static ListaEncadeada uniao(ListaEncadeada conjuntoA, ListaEncadeada conjuntoB) {
        ListaEncadeada resultado = new ListaEncadeada();
        Nodo aux = conjuntoA.getInicio();
        while (aux != null) {
            resultado.inserirFinal(aux.getDado());
            aux = aux.getProx();
        }
        aux = conjuntoB.getInicio();
        while (aux != null) {
            resultado.inserirFinal(aux.getDado());
            aux = aux.getProx();
        }
        return resultado;
    }

    // Operação de intersecção entre dois conjuntos
    public static ListaEncadeada interseccao(ListaEncadeada conjuntoA, ListaEncadeada conjuntoB) {
        ListaEncadeada resultado = new ListaEncadeada();
        Nodo aux = conjuntoA.getInicio();
        while (aux != null) {
            if (conjuntoB.contem(aux.getDado())) {
                resultado.inserirFinal(aux.getDado());
            }
            aux = aux.getProx();
        }
        return resultado;
    }

    // Operação de diferença entre dois conjuntos
    public static ListaEncadeada diferenca(ListaEncadeada conjuntoA, ListaEncadeada conjuntoB) {
        ListaEncadeada resultado = new ListaEncadeada();
        Nodo aux = conjuntoA.getInicio();
        while (aux != null) {
            if (!conjuntoB.contem(aux.getDado())) {
                resultado.inserirFinal(aux.getDado());
            }
            aux = aux.getProx();
        }
        return resultado;
    }

    public static void main(String[] args) {

        ListaEncadeada conjuntoA = new ListaEncadeada();
        ListaEncadeada conjuntoB = new ListaEncadeada();

        conjuntoA.inserirFinal(1);
        conjuntoA.inserirFinal(2);
        conjuntoA.inserirFinal(3);
        conjuntoA.inserirFinal(4);
        conjuntoA.inserirFinal(5);

        conjuntoB.inserirFinal(4);
        conjuntoB.inserirFinal(5);
        conjuntoB.inserirFinal(6);
        conjuntoB.inserirFinal(7);
        conjuntoB.inserirFinal(8);

        System.out.println("Conjunto A:");
        conjuntoA.mostrarLista();
        System.out.println("Conjunto B:");
        conjuntoB.mostrarLista();

        System.out.println("União:");
        ListaEncadeada uniao = uniao(conjuntoA, conjuntoB);
        uniao.mostrarLista();

        System.out.println("Intersecção:");
        ListaEncadeada interseccao = interseccao(conjuntoA, conjuntoB);
        interseccao.mostrarLista();

        System.out.println("Diferença:");
        ListaEncadeada diferenca = diferenca(conjuntoA, conjuntoB);
        diferenca.mostrarLista();
    }
}
