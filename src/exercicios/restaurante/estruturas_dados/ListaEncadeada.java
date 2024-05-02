package exercicios.restaurante.estruturas_dados;

public class ListaEncadeada<T> {
    private Nodo<T> inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    public void adicionar(T conteudo) {
        Nodo<T> novo = new Nodo<T>(conteudo);
        if (this.inicio == null) {
            this.inicio = novo;
        } else {
            Nodo<T> atual = this.inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
    }

    public void remover(T conteudo) {
        if (this.inicio != null) {
            Nodo<T> atual = this.inicio;
            Nodo<T> anterior = null;
            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                anterior = atual;
                atual = atual.getProximo();
            }
            if (atual != null) {
                if (anterior == null) {
                    this.inicio = atual.getProximo();
                } else {
                    anterior.setProximo(atual.getProximo());
                }
            }
        }
    }

    public void imprimir() {
        Nodo<T> atual = this.inicio;
        while (atual != null) {
            System.out.println(atual.getConteudo());
            atual = atual.getProximo();
        }
    }

    public Nodo<T> getInicio() {
        return this.inicio;
    }

    public Nodo<T> buscar(T conteudo) {
        Nodo<T> atual = this.inicio;
        while (atual != null && !atual.getConteudo().equals(conteudo)) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public void atualizar(T conteudo) {
        Nodo<T> atual = this.inicio;
        while (atual != null && !atual.getConteudo().equals(conteudo)) {
            atual = atual.getProximo();
        }
        if (atual != null) {
            atual.setConteudo(conteudo);
        }
    }
}
