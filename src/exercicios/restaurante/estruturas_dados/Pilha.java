package exercicios.restaurante.estruturas_dados;

public class Pilha<T> {
    private Nodo<T> topo;

    public Pilha() {
        this.topo = null;
    }

    public void adicionar(T conteudo) {
        Nodo<T> novo = new Nodo<T>(conteudo);
        if (this.topo == null) {
            this.topo = novo;
        } else {
            novo.setProximo(this.topo);
            this.topo = novo;
        }
    }

    public void remover() {
        if (this.topo != null) {
            this.topo = this.topo.getProximo();
        }
    }

    public void imprimir() {
        Nodo<T> atual = this.topo;
        while (atual != null) {
            System.out.println(atual.getConteudo());
            atual = atual.getProximo();
        }
    }

    public Nodo<T> getTopo() {
        return this.topo;
    }

}
