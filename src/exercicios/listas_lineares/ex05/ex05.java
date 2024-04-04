package exercicios.listas_lineares.ex05;

public class ex05 {

    public void _ex05(Nodo cabeca, int limite) {
        Pilha pilha = new Pilha(limite);

        // Percorre a lista e empilha cada valor
        Nodo atual = cabeca;
        while (atual != null) {
            pilha.push(atual.getDado());
            atual = atual.getProx();
        }

        // Desempilha e exibe os valores, que serão mostrados na ordem inversa
        while (!pilha.estaVazio()) {
            pilha.pop(); // <- A função já faz o print
        }
    }

    public static void main(String[] args) {
        Nodo cabeca = new Nodo(1);
        Nodo nodo2 = new Nodo(2);
        Nodo nodo3 = new Nodo(3);
        Nodo nodo4 = new Nodo(4);
        Nodo nodo5 = new Nodo(5);

        cabeca.setProx(nodo2);
        nodo2.setProx(nodo3);
        nodo3.setProx(nodo4);
        nodo4.setProx(nodo5);

        ex05 ex = new ex05();
        ex._ex05(cabeca, 5);
    }

}
