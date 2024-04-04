package exercicios.listas_lineares.ex08;

public class Fila {
    private Nodo inicio;
    private Nodo fim;
    private int limite;
    private int tamanho = 0;

    public Fila(int limite) {
        this.limite = limite;
    }

    public void mostrarFila() {
        if (estaVazio()) {
            System.out.println("Fila está vazia!");
            return;
        }
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDado() + " ");
            aux = aux.getProx();
        }
        System.out.println("");
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean temEspaco() {
        return limite > tamanho;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public Integer getInicio() {
        if (!estaVazio()) {
            return inicio.getDado();

        } else {
            System.out.println("Fila está vazia!");
            return null;
        }

    }

    public void inserir(int dado) {
        if (temEspaco()) {
            Nodo novoItem = new Nodo(dado);
            if (estaVazio()) {
                inicio = novoItem;
                fim = novoItem;
            } else {
                fim.setProx(novoItem);
                fim = novoItem;
            }
            tamanho++;
        } else {
            System.out.println("Fila cheia!");
        }
    }

    public Integer remover() {
        if (estaVazio()) {
            return null;
        }
        int valor = inicio.getDado();
        inicio = inicio.getProx();
        tamanho--;
        if (estaVazio()) {
            fim = null;
        }
        return valor;
    }

}
