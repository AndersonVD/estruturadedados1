package exercicios.listas_lineares.ex03;

public class ListaCircular {
    private Nodo inicio;
    private Nodo fim;

    public ListaCircular() {
        inicio = null;
    }

    public Nodo getinicio() {
        return inicio;
    }

    public void inserirOrdenado(int dado) {
        Nodo novoNodo = new Nodo(dado);
        if (inicio == null || dado <= inicio.getDado()) {
            inserirInicio(dado); // Já ajusta inicio e fim se necessário
        } else {
            // Buscar posição de inserção
            Nodo atual = inicio;
            while (atual.getProx() != inicio && atual.getProx().getDado() < dado) {
                atual = atual.getProx();
            }
            novoNodo.setProx(atual.getProx());
            atual.setProx(novoNodo);
            if (atual == fim) {
                fim = novoNodo; // Atualiza o fim se inserido no final
            }
        }
    }

    public void inserirInicio(int dado) {
        Nodo novoNodo = new Nodo(dado);
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
            lista += aux.getDado() + "\n";
            aux = aux.getProx();
        } while (aux != inicio);
        return lista;
    }

    public void inserirFinal(int dado) {
        if (inicio == null) {
            inserirInicio(dado);
            return;
        }
        Nodo aux = inicio;
        Nodo novoNodo = new Nodo(dado);
        while (aux.getProx() != inicio) {
            aux = aux.getProx();
        }
        aux.setProx(novoNodo);
        novoNodo.setProx(inicio);
    }

    public int buscaValorCircular(int valor) {
        int index = 0;
        if (inicio == null) {
            return -1;
        }
        Nodo aux = inicio;
        do {
            index++;
            if (aux.getDado() == valor) {
                return index;
            }
            aux = aux.getProx();
        } while (aux != inicio);
        return -1;
    }

    public void deleteComValor(int dado) {
        if (inicio == null) {
            return;
        }
        if (inicio.getDado() == dado) {
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
            if (aux.getProx().getDado() == dado) {
                aux.setProx(aux.getProx().getProx());
                return;
            }
            aux = aux.getProx();
        } while (aux != inicio);

    }

}