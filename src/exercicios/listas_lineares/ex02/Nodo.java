package exercicios.listas_lineares.ex02;

public class Nodo {
    private Produto produto;
    private Nodo prox;

    // construtor
    public Nodo(Produto produto) {
        this.produto = produto;
        this.prox = null;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Nodo getProx() {
        return prox;
    }

    public void setProx(Nodo prox) {
        this.prox = prox;
    }

}
