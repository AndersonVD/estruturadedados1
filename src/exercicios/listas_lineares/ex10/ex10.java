package exercicios.listas_lineares.ex10;

public class ex10 {
    public static void main(String[] args) {
        ListaCircular L2 = new ListaCircular();
        for (int i = 0; i < 100; i++) {
            int numeroAleatorio = (int) (Math.random() * 1000); // Gera números aleatórios entre 0 e 999
            L2.inserirOrdenado(numeroAleatorio);
        }

        System.out.println("Números em L2:");
        System.out.println(L2.mostrarLista());

        calcularEstatisticas(L2);
    }

    private static void calcularEstatisticas(ListaCircular L2) {
        int soma = 0, contador = 0, maxFreq = 0, moda = -1;
        double media, mediana = 0;
        int[] frequencia = new int[1000]; // Assumindo que os números estão no intervalo [0,999]
        Nodo atual = L2.getinicio();

        if (atual == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        int primeiroValor = atual.getDado(); // Para ajudar no cálculo da mediana
        int ultimoValor = primeiroValor; // Assume o mesmo valor inicialmente

        do {
            int valorAtual = atual.getDado();
            soma += valorAtual;
            contador++;
            frequencia[valorAtual]++;

            if (frequencia[valorAtual] > maxFreq) {
                maxFreq = frequencia[valorAtual];
                moda = valorAtual;
            }

            ultimoValor = valorAtual; // Atualiza o último valor para a mediana
            atual = atual.getProx();
        } while (atual != L2.getinicio() && atual.getDado() != primeiroValor);

        media = (double) soma / contador;

        // Simplificação para mediana, já que os números estão ordenados e inseridos
        // sequencialmente
        if (contador % 2 == 0) {
            mediana = (primeiroValor + ultimoValor) / 2.0;
        } else {
            mediana = ultimoValor;
        }

        System.out.println("Média: " + media);
        System.out.println("Moda: " + moda + " com frequência de: " + maxFreq);
        System.out.println("Mediana: " + mediana);
    }
}
