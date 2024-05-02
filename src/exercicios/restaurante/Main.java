package exercicios.restaurante;

import exercicios.restaurante.gestaoCliente.gestaoClientes;
import exercicios.restaurante.gestaoMesas.gestaoMesas;

public class Main {

    public void SimularAtendimento() {
        // Simulação do Fluxo de Atendimento:
        // a. Encaminhamento de clientes para mesas disponíveis.
        // b. Atendimento de pedidos pelos garçons.
        // c. Preparação de pedidos pelos cozinheiros.
        // d. Entrega de pedidos aos clientes.
        // e. Cobrança e fechamento de contas.

        // Inicialização do sistema de gestão de mesas
        gestaoMesas gestaoMesas = new gestaoMesas();

        // Alocação de mesas
        gestaoMesas.alocarMesa(1, 4);

        // Consulta de mesas
        gestaoMesas.consultarMesas();

        // Alocação de mesas
        gestaoMesas.alocarMesa(2, 2);

        // Consulta de mesas

        gestaoMesas.consultarMesas();

        // Liberação de mesas
        gestaoMesas.liberarMesa(1);

        // Consulta de mesas
        gestaoMesas.consultarMesas();

    }

    public static void main(String[] args) {

        // Inicialização do sistema de gestão de clientes
        gestaoClientes gestaoClientes = new gestaoClientes();

        // Cadastro de clientes
        gestaoClientes.cadastrarCliente("João", "123.456.789-00", "Pizza");
        gestaoClientes.cadastrarCliente("Maria", "987.654.321-00", "Hambúrguer");
        gestaoClientes.cadastrarCliente("José", "456.789.123-00", "Salada");

        // Consulta de clientes

        gestaoClientes.consultarCliente("123.456.789-00");
        gestaoClientes.consultarCliente("987.654.321-00");

        // Atualização de clientes
        gestaoClientes.atualizarCliente("123.456.789-00", "João da Silva", "Pizza de Calabresa");

        // Remoção de clientes
        gestaoClientes.removerCliente("456.789.123-00");

        // Consulta de clientes
        gestaoClientes.consultarCliente("123.456.789-00");

    }

}
