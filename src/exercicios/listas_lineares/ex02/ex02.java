package exercicios.listas_lineares.ex02;

import java.util.Scanner;

public class ex02 {

    public void adicionarProduto(ListaCircular listaProdutos, int codigoProduto, double preco, int quantidade) {
        Produto produto = new Produto(codigoProduto, preco, quantidade);
        listaProdutos.inserirInicio(produto);
    }

    public void gerarRelatorio(ListaCircular listaProdutos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o desconto dos produtos: ");
        float desconto = scanner.nextFloat();

        // Aplicar desconto e gerar o relatório
        Nodo aux = listaProdutos.getinicio();
        int quantidadeEstoque = 0;
        do {
            Produto produto = aux.getProduto();
            produto.setPreco(produto.getPreco() - (produto.getPreco() * desconto / 100));
            System.out.println("Código: " + produto.getCodigo() + " Preço: " + produto.getPreco());
            if (produto.getQuantidade() > 100) {
                quantidadeEstoque++;
            }
            aux = aux.getProx();
        } while (aux != listaProdutos.getinicio());

        System.out.println("Quantidade de estoque dos produtos com quantidade maior que 100: " + quantidadeEstoque);
        scanner.close();
    }

    public static void main(String[] args) {

        ex02 ex02 = new ex02();
        ListaCircular listaProdutos = new ListaCircular();
        ex02.adicionarProduto(listaProdutos, 1, 10, 101);
        ex02.adicionarProduto(listaProdutos, 2, 14, 1);
        ex02.adicionarProduto(listaProdutos, 3, 4, 1);
        ex02.adicionarProduto(listaProdutos, 4, 15, 101);
        ex02.adicionarProduto(listaProdutos, 5, 23423, 101);
        ex02.adicionarProduto(listaProdutos, 6, 53, 1);
        ex02.gerarRelatorio(listaProdutos);
    }
}
