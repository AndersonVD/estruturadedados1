package exercicios.restaurante.estruturas_dados;

public class Nodo<T> {
    private T conteudo;
    private Nodo<T> proximo;

    public Nodo(T conteudo) {
        this.conteudo = conteudo;
        this.proximo = null;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Nodo<T> getProximo() {
        return this.proximo;
    }

    public void setProximo(Nodo<T> proximo) {
        this.proximo = proximo;
    }

}
