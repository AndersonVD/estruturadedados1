package exercicios.listas_lineares.ex07;

public class Fila {
    private Nodo inicio;
    private Nodo fim;
    private int limite;
    private int tamanho = 0;

    public Fila(int limite) {
        this.limite = limite;
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

    public void mostrarFila() {
        if (estaVazio()) {
            System.out.println("Fila está vazia!");
            return;
        }
        Nodo atual = inicio;
        while (atual != null) {
            System.out.println(atual.getDado() + " ");
            atual = atual.getProx();
        }
        System.out.println("");
    }

    public Integer getInicio() {
        if (!estaVazio()) {
            return inicio.getDado();

        } else {
            System.out.println("Fila está vazia!");
            return null;
        }

    }

    public void inserir(int dado, int prioridade) {
        if (!temEspaco()) {
            System.out.println("Fila cheia!");
            return;
        }

        Nodo novoItem = new Nodo(dado, prioridade);

        if (estaVazio()) {
            inicio = fim = novoItem;
        } else if (inicio.getPrioridade() < prioridade) {
            // Se a prioridade for maior que a do primeiro elemento, insira no início
            novoItem.setProx(inicio);
            inicio = novoItem;
        } else {
            // Encontre o ponto de inserção baseado na prioridade
            Nodo atual = inicio;
            while (atual.getProx() != null && atual.getProx().getPrioridade() >= prioridade) {
                atual = atual.getProx();
            }
            novoItem.setProx(atual.getProx());
            atual.setProx(novoItem);
            if (atual == fim) {
                fim = novoItem; // Atualize o fim se inserido no final
            }
        }
        tamanho++;
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
