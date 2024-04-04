package exercicios.listas_lineares.ex09;

public class ListaEncadeada {

    private Nodo inicio;

    // construtor
    public ListaEncadeada() {
        inicio = null;
    }

    public boolean vazia() {
        return inicio == null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void exibirMaiorSalario() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }

        double maiorSalario = inicio.getDado().getSalario();
        Nodo atual = inicio.getProx();
        while (atual != null) {
            if (atual.getDado().getSalario() > maiorSalario) {
                maiorSalario = atual.getDado().getSalario();
            }
            atual = atual.getProx();
        }

        System.out.println("Funcionário(s) com o maior salário: ");
        atual = inicio;
        while (atual != null) {
            if (atual.getDado().getSalario() == maiorSalario) {
                System.out.println(atual.getDado().getNome() + " - R$ " + atual.getDado().getSalario());
            }
            atual = atual.getProx();
        }
    }

    public void calcularMediaSalarial() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }

        double somaSalarios = 0;
        int contador = 0;
        Nodo atual = inicio;
        while (atual != null) {
            somaSalarios += atual.getDado().getSalario();
            contador++;
            atual = atual.getProx();
        }

        System.out.println("Média salarial: R$ " + (somaSalarios / contador));
    }

    public void contarFuncionariosAcimaDe(double valor) {
        int contador = 0;
        Nodo atual = inicio;
        while (atual != null) {
            if (atual.getDado().getSalario() > valor) {
                contador++;
            }
            atual = atual.getProx();
        }

        if (contador == 0) {
            System.out.println("Nenhum funcionário com salário acima de R$ " + valor);
        } else {
            System.out.println("Quantidade de funcionários com salário acima de R$ " + valor + ": " + contador);
        }
    }

    public void inserirOrdenado(String nome, double salario) {
        Funcionario novoFuncionario = new Funcionario(nome, salario);
        Nodo novoNodo = new Nodo(novoFuncionario);

        if (vazia()) {
            inicio = novoNodo;
            return;
        }

        if (inicio.getDado().getSalario() > salario) {
            novoNodo.setProx(inicio);
            inicio = novoNodo;
            return;
        }

        Nodo aux = inicio;
        while (aux.getProx() != null && aux.getProx().getDado().getSalario() < salario) {
            aux = aux.getProx();
        }
        novoNodo.setProx(aux.getProx());
        aux.setProx(novoNodo);

    }

    public void mostrarLista() {
        if (vazia()) {
            System.out.println("Lista Vazia");
            return;
        }
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDado() + " ");
            aux = aux.getProx();
        }
        System.out.println("");
    }

    public void contarNodos() {
        int countNodos = 1;
        if (vazia()) {
            System.out.println("Lista Vazia");
            return;
        }
        Nodo aux = inicio;
        while (aux.getProx() != null) {
            countNodos++;
            aux = aux.getProx();
        }
        System.out.println("Quantidade de Nodos: " + countNodos);

    }

    public void deletarPrimeiro() {
        if (vazia()) {
            return;
        }
        inicio = inicio.getProx();
    }

    public void deletarUltimo() {
        if (vazia()) {
            return;
        }
        if (inicio.getProx() == null) {
            inicio = null;
            return;
        }
        Nodo aux = inicio;
        while (aux.getProx().getProx() != null) {
            aux = aux.getProx();
        }
        aux.setProx(null);
    }

}
