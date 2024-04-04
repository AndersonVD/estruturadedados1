package exercicios.listas_lineares.ex05;

public class Pilha {
    private Nodo topo;
    private int tamanho = 0;
    private int limite = 0;

    public Pilha(int limite) {
        this.limite = limite;
    }

    public int getTopo() {
        return topo.getDado();
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public boolean temEspaco() {
        return limite > tamanho;
    }

    // inserir no topo, pois é uma pilha
    public void push(int dado) {
        if (temEspaco()) {
            Nodo novoItem = new Nodo(dado);
            novoItem.setProx(topo);
            topo = novoItem;
            tamanho++;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    // remover no topo
    public void pop() {
        if (!estaVazio()) {
            System.out.println(topo.getDado() + " foi retirado da pilha");
            topo = topo.getProx();
            tamanho--;
        } else {
            System.out.println("Pilha esta vazia!");
        }
    }
}
