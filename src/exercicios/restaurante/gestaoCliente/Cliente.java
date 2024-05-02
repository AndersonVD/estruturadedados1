package exercicios.restaurante.gestaoCliente;

public class Cliente {
    String nome;
    String cpf;
    String pedido;

    public Cliente(String nome, String cpf, String pedido) {
        this.nome = nome;
        this.cpf = cpf;
        this.pedido = pedido;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Cliente cliente = (Cliente) obj;
        return cpf.equals(cliente.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }
}
