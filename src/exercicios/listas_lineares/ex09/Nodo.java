package exercicios.listas_lineares.ex09;

public class Nodo {
    private Funcionario funcionario;
    private Nodo prox;

    // construtor
    public Nodo(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.prox = null;
    }

    public Funcionario getDado() {
        return funcionario;
    }

    public void setDado(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Nodo getProx() {
        return prox;
    }

    public void setProx(Nodo prox) {
        this.prox = prox;
    }

}
