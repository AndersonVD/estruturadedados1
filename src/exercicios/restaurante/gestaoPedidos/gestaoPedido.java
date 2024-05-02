package exercicios.restaurante.gestaoPedidos;

import exercicios.restaurante.estruturas_dados.ListaEncadeada;
import exercicios.restaurante.estruturas_dados.Nodo;

// Gestão de Pedidos: 
// a. Registro de novos pedidos. 
// b.  Alteração de pedidos. 
// c. Cancelamento de pedidos. 
// d.  Consulta de pedidos realizados. 

public class gestaoPedido {
    private ListaEncadeada<Pedido> pedidos = new ListaEncadeada<>();

    public void registrarPedido(String nome, String descricao, double valor) {
        Pedido novoPedido = new Pedido(nome, descricao, valor);
        pedidos.adicionar(novoPedido);
    }

    public void alterarPedido(String nome, String novaDescricao, double novoValor) {
        Pedido pedidoAtualizado = new Pedido(nome, novaDescricao, novoValor);
        pedidos.atualizar(pedidoAtualizado);
    }

    public void cancelarPedido(String nome) {
        Pedido pedido = new Pedido(nome, "", 0); // Somente o nome é necessário para identificação
        pedidos.remover(pedido);
    }

    public Pedido consultarPedido(String nome) {
        Nodo<Pedido> resultado = pedidos.buscar(new Pedido(nome, "", 0));
        Pedido pedidoEncontrado = null;
        if (resultado != null) {
            pedidoEncontrado = resultado.getConteudo();
            System.out.println("Pedido encontrado: Nome - " + pedidoEncontrado.getNome() + ", Descrição - "
                    + pedidoEncontrado.getDescricao() + ", Valor - " + pedidoEncontrado.getValor());
        } else {
            System.out.println("Pedido não encontrado.");
        }
        return pedidoEncontrado;
    }
}
