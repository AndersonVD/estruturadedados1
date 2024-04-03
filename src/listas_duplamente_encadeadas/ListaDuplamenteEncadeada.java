package listas_duplamente_encadeadas;

public class ListaDuplamenteEncadeada {
    private Nodo inicio;
    private Nodo fim;

    public void inserirInicio(int dado) {
        Nodo novo = new Nodo(dado);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
    }

    public void inserirFinal(int dado) {
        Nodo novo = new Nodo(dado);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.setProx(novo);
            novo.setAnt(fim);
            fim = novo;
        }
    }

    public void removeInicio() {
        if (inicio == null) {
            return;
        }
        Nodo nodoRemovido = inicio;
        inicio = inicio.getProx();
        if (inicio != null) {
            inicio.setAnt(null);
        }
        if (nodoRemovido == fim) {
            removeFinal();
        }
    }

    public void removeFinal() {
        if (fim == null) {
            return;
        }
        Nodo novoRemovido = fim;
        fim = fim.getAnt();
        if (fim != null) {
            fim.setProx(null);
        }
        if (novoRemovido == inicio) {
            removeInicio();
        }
    }

    public String mostrarLista() {
        String lista = "";
        if (inicio == null) {
            return lista;
        }
        Nodo aux = inicio;
        while (aux != null) {
            lista += aux.getDado() + "\n";
            aux = aux.getProx();
        }
        return lista;
    }
}
