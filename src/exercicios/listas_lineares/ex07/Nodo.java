package exercicios.listas_lineares.ex07;

public class Nodo {
    private int dado;
    private int prioridade;
    private Nodo prox;

    // construtor
    public Nodo(int dado, int prioridade) {
        this.dado = dado;
        this.prox = null;
        this.prioridade = prioridade;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Nodo getProx() {
        return prox;
    }

    public void setProx(Nodo prox) {
        this.prox = prox;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

}
