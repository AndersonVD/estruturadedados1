package exercicios.restaurante.estruturas_dados;

public class Fila<T> {
    private Nodo<T> inicio;

    public Fila() {
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

    public void remover() {
        if (this.inicio != null) {
            this.inicio = this.inicio.getProximo();
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

}
