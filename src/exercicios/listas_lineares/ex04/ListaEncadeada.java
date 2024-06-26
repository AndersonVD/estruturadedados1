package exercicios.listas_lineares.ex04;

public class ListaEncadeada {

    private Nodo inicio;

    // construtor
    public ListaEncadeada() {
        inicio = null;
    }

    public boolean vazia() {
        return inicio == null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void inserirInicio(int dado) {
        Nodo novoNodo = new Nodo(dado);
        novoNodo.setProx(inicio);
        inicio = novoNodo;
    }

    public void mostrarLista() {
        if (vazia()) {
            System.out.println("Lista Vazia");
            return;
        }
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDado() + " ");
            aux = aux.getProx();
        }
        System.out.println("");
    }

    public void deleteComValor(int valor) {
        if (vazia()) {
            return;
        }
        if (inicio.getDado() == valor) {
            inicio = inicio.getProx();
            return;
        }
        Nodo aux = inicio;
        while (aux.getProx() != null) {
            if (aux.getProx().getDado() == valor) {
                aux.setProx(aux.getProx().getProx());
                return;
            }
            aux = aux.getProx();
        }
    }

    public void contarNodos() {
        int countNodos = 1;
        if (vazia()) {
            System.out.println("Lista Vazia");
            return;
        }
        Nodo aux = inicio;
        while (aux.getProx() != null) {
            countNodos++;
            aux = aux.getProx();
        }
        System.out.println("Quantidade de Nodos: " + countNodos);

    }

    public void deletarPrimeiro() {
        if (vazia()) {
            return;
        }
        inicio = inicio.getProx();
    }

    public void deletarUltimo() {
        if (vazia()) {
            return;
        }
        if (inicio.getProx() == null) {
            inicio = null;
            return;
        }
        Nodo aux = inicio;
        while (aux.getProx().getProx() != null) {
            aux = aux.getProx();
        }
        aux.setProx(null);
        ;
    }

    public boolean contem(int dado) {
        if (vazia()) {
            return false;
        }
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getDado() == dado) {
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }

    public void pegarPosicaoDado(int dado) {
        int posicao = 0;
        if (vazia()) {
            return;
        }
        if (inicio.getDado() == dado) {
            System.out.println("Posição: " + posicao + " Dado: " + dado);
            return;
        }
        Nodo aux = inicio;
        while (aux.getDado() != dado) {
            posicao++;
            aux = aux.getProx();
        }
        System.out.println("Posição: " + posicao + "Dado: " + dado);

    }

    public void inserirFinal(int dado) {
        if (vazia()) {
            inserirInicio(dado);
            return;
        }
        Nodo novoNodo = new Nodo(dado);
        Nodo aux = inicio;
        while (aux.getProx() != null) {
            aux = aux.getProx();
        }
        aux.setProx(novoNodo);
    }
}
