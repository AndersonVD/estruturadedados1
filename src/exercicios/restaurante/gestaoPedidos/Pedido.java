package exercicios.restaurante.gestaoPedidos;

public class Pedido {
    private String nome;
    private String descricao;
    private double valor;

    public Pedido(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pedido pedido = (Pedido) obj;
        return nome.equals(pedido.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }
}
