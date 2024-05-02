package exercicios.restaurante.gestaoMesas;

public class Mesa {
    private int numero;
    private int capacidade;
    private boolean disponivel;

    public Mesa(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.disponivel = true;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Mesa mesa = (Mesa) obj;
        return numero == mesa.numero;
    }

    @Override
    public int hashCode() {
        return numero;
    }
}
