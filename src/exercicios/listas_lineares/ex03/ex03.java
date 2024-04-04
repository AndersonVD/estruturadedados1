package exercicios.listas_lineares.ex03;

public class ex03 {

    public void mediaNumerica() {
        ListaCircular listaCircular = new ListaCircular();

        // inserir Nodos aleatoriamente
        for (int i = 6; i < 100; i++) {
            listaCircular.inserirInicio(i);
        }

        Nodo aux = listaCircular.getinicio();
        if (aux == null) {
            System.out.println("Lista vazia");
            return;
        }

        int inicio_dado = aux.getDado();
        int maior = inicio_dado;
        int menor = inicio_dado;
        int soma = 0;
        int totalNodos = 0;
        do {
            totalNodos++;
            int dado = aux.getDado();
            soma += dado;
            if (dado > maior) {
                maior = dado;
            }
            if (dado < menor) {
                menor = dado;
            }
            aux = aux.getProx();
        } while (aux != listaCircular.getinicio());

        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
        System.out.println("Média aritmética: " + (soma / totalNodos));
    }

    public static void main(String[] args) {
        ex03 ex03 = new ex03();
        ex03.mediaNumerica();

    }
}
