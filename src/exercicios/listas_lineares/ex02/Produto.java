package exercicios.listas_lineares.ex02;

public class Produto {
    private int codigo;
    private double preco;
    private int quantidade;

    public Produto(int codigo, double preco, int quantidade) {
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
