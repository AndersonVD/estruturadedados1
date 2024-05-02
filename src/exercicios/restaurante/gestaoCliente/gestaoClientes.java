package exercicios.restaurante.gestaoCliente;

import exercicios.restaurante.estruturas_dados.ListaEncadeada;
import exercicios.restaurante.estruturas_dados.Nodo;

// // Estruturas de Dados I – Profº  Daniel Gomes Soares 
// Ciência da Computação  

// TRABALHO 1 

// O objetivo deste trabalho é implementar um programa em Java que simule o 
// funcionamento de um restaurante utilizando estruturas de dados como listas encadeadas, 
// pilhas  e  filas.  O  programa  deverá  ser  capaz  de  gerenciar  o  fluxo  de  clientes,  pedidos, 
// mesas e funcionários, proporcionando uma experiência realista de operação de 
// restaurante. 

// Funcionalidades a serem implementadas: 

// 1. Gestão de Clientes: 
// a. Cadastro de novos clientes. 
// b.  Remoção de clientes. 
// c. Atualização de informações dos clientes. 
// d.  Consulta de clientes cadastrados. 

public class gestaoClientes {
    private ListaEncadeada<Cliente> clientes = new ListaEncadeada<>();

    public void cadastrarCliente(String nome, String cpf, String pedido) {
        Cliente novoCliente = new Cliente(nome, cpf, pedido);
        clientes.adicionar(novoCliente);
    }

    public void removerCliente(String cpf) {
        Cliente cliente = new Cliente("", cpf, ""); // Somente o CPF é necessário para identificação
        clientes.remover(cliente);
    }

    public void atualizarCliente(String cpf, String novoNome, String novoPedido) {
        Cliente clienteAtualizado = new Cliente(novoNome, cpf, novoPedido);
        clientes.atualizar(clienteAtualizado);
    }

    public Cliente consultarCliente(String cpf) {
        Nodo<Cliente> resultado = clientes.buscar(new Cliente("", cpf, ""));
        Cliente clienteEncontrado = null;
        if (resultado != null) {
            clienteEncontrado = resultado.getConteudo();
            System.out
                    .println("Cliente encontrado: Nome - " + clienteEncontrado.nome + ", CPF - " + clienteEncontrado.cpf
                            + ", Pedido - " + clienteEncontrado.pedido);
        } else {
            System.out.println("Cliente não encontrado.");
        }
        return clienteEncontrado;
    }
}
