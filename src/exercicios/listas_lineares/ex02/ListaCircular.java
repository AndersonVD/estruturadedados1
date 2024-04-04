package exercicios.listas_lineares.ex02;

public class ListaCircular {
    private Nodo inicio;
    private Nodo fim;

    public ListaCircular() {
        inicio = null;
    }

    public Nodo getinicio() {
        return inicio;
    }

    public void inserirInicio(Produto produto) {
        Nodo novoNodo = new Nodo(produto);
        if (inicio == null) { // Caso a lista esteja vazia
            inicio = novoNodo;
            inicio.setProx(inicio);
            fim = inicio;
        } else {// Caso a lista não esteja vazia
            novoNodo.setProx(inicio);
            inicio = novoNodo;
            fim.setProx(inicio);
        }
    }

    public String mostrarLista() {
        String lista = "";
        if (inicio == null)
            return lista;
        Nodo aux = inicio;
        do {
            lista += aux.getProduto() + "\n";
            aux = aux.getProx();
        } while (aux != inicio);
        return lista;
    }

    public void inserirFinal(Produto produto) {
        if (inicio == null) {
            inserirInicio(produto);
            return;
        }
        Nodo aux = inicio;
        Nodo novoNodo = new Nodo(produto);
        while (aux.getProx() != inicio) {
            aux = aux.getProx();
        }
        aux.setProx(novoNodo);
        novoNodo.setProx(inicio);
    }

    public int buscaValorCircular(Produto produto) {
        int index = 0;
        if (inicio == null) {
            return -1;
        }
        Nodo aux = inicio;
        do {
            index++;
            if (aux.getProduto() == produto) {
                return index;
            }
            aux = aux.getProx();
        } while (aux != inicio);
        return -1;
    }

    public void deleteComValor(Produto produto) {
        if (inicio == null) {
            return;
        }
        if (inicio.getProduto() == produto) {
            if (inicio == fim) {
                inicio = null;
                return;
            }
            // se elemento for o primeiro da lista mas lista contém mais elementos
            inicio = inicio.getProx();
            fim.setProx(inicio);
            return;
        }

        Nodo aux = inicio;
        do {
            if (aux.getProx().getProduto() == produto) {
                aux.setProx(aux.getProx().getProx());
                return;
            }
            aux = aux.getProx();
        } while (aux != inicio);

    }

}