package exercicios.restaurante.gestaoMesas;

import exercicios.restaurante.estruturas_dados.ListaEncadeada;
import exercicios.restaurante.estruturas_dados.Nodo;

// Gestão de Mesas: 
// a. Alocação de mesas para clientes. 
// b.  Liberação de mesas após a saída dos clientes. 
// c. Consulta de mesas ocupadas e disponíveis. 
// d.  Controle de capacidade das mesas

public class gestaoMesas {

    private ListaEncadeada<Mesa> mesas = new ListaEncadeada<>();

    public void alocarMesa(int numero, int capacidade) {
        Mesa novaMesa = new Mesa(numero, capacidade);
        mesas.adicionar(novaMesa);
    }

    public void liberarMesa(int numero) {
        Mesa mesa = new Mesa(numero, 0); // Somente o número é necessário para identificação
        mesas.remover(mesa);
    }

    public void consultarMesas() {
        Nodo<Mesa> atual = mesas.getInicio();
        while (atual != null) {
            Mesa mesa = atual.getConteudo();
            if (mesa.isDisponivel()) {
                System.out.println(
                        "Mesa " + mesa.getNumero() + " - Capacidade: " + mesa.getCapacidade() + " - Disponível");
            } else {
                System.out
                        .println("Mesa " + mesa.getNumero() + " - Capacidade: " + mesa.getCapacidade() + " - Ocupada");
            }
            atual = atual.getProximo();
        }
    }

    public void consultarMesasOcupadas() {
        Nodo<Mesa> atual = mesas.getInicio();
        while (atual != null) {
            Mesa mesa = atual.getConteudo();
            if (!mesa.isDisponivel()) {
                System.out
                        .println("Mesa " + mesa.getNumero() + " - Capacidade: " + mesa.getCapacidade() + " - Ocupada");
            }
            atual = atual.getProximo();
        }
    }

    public void consultarMesasDisponiveis() {
        Nodo<Mesa> atual = mesas.getInicio();
        while (atual != null) {
            Mesa mesa = atual.getConteudo();
            if (mesa.isDisponivel()) {
                System.out.println(
                        "Mesa " + mesa.getNumero() + " - Capacidade: " + mesa.getCapacidade() + " - Disponível");
            }
            atual = atual.getProximo();
        }
    }

    public void consultarCapacidadeMesas() {
        Nodo<Mesa> atual = mesas.getInicio();
        while (atual != null) {
            Mesa mesa = atual.getConteudo();
            System.out.println("Mesa " + mesa.getNumero() + " - Capacidade: " + mesa.getCapacidade());
            atual = atual.getProximo();

        }
    }
}
