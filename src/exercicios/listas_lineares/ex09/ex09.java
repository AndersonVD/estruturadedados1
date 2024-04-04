package exercicios.listas_lineares.ex09;

public class ex09 {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirOrdenado("João", 1000);
        lista.inserirOrdenado("Maria", 2000);
        lista.inserirOrdenado("José", 3000);
        lista.inserirOrdenado("Ana", 4000);
        lista.inserirOrdenado("Carlos", 5000);
        lista.inserirOrdenado("Laura", 6000);
        lista.inserirOrdenado("Pedro", 7000);
        lista.inserirOrdenado("Sara", 8000);
        lista.inserirOrdenado("Mariana", 9000);
        lista.inserirOrdenado("Lucas", 10000);
        lista.inserirOrdenado("Sousa", 10000);

        lista.contarFuncionariosAcimaDe(39);
        lista.calcularMediaSalarial();
        lista.exibirMaiorSalario();

    }
}
