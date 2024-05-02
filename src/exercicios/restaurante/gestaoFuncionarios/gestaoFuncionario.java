package exercicios.restaurante.gestaoFuncionarios;

import exercicios.restaurante.estruturas_dados.ListaEncadeada;
import exercicios.restaurante.estruturas_dados.Nodo;

// Gestão de Funcionários: 
// a. Cadastro de novos funcionários (garçons, cozinheiros, etc.). 
// b.  Remoção de funcionários. 
// c. Escala de trabalho dos funcionários. 
// d.  Consulta de funcionários cadastrados.

public class gestaoFuncionario {
    private ListaEncadeada<Funcionario> funcionarios = new ListaEncadeada<>();

    public void cadastrarFuncionario(String nome, String cpf, String funcao) {
        Funcionario novoFuncionario = new Funcionario(nome, cpf, funcao);
        funcionarios.adicionar(novoFuncionario);
    }

    public void removerFuncionario(String cpf) {
        Funcionario funcionario = new Funcionario("", cpf, ""); // Somente o CPF é necessário para identificação
        funcionarios.remover(funcionario);
    }

    public void atualizarFuncionario(String cpf, String novoNome, String novaFuncao) {
        Funcionario funcionarioAtualizado = new Funcionario(novoNome, cpf, novaFuncao);
        funcionarios.atualizar(funcionarioAtualizado);
    }

    public Funcionario consultarFuncionario(String cpf) {
        Nodo<Funcionario> resultado = funcionarios.buscar(new Funcionario("", cpf, ""));
        Funcionario funcionarioEncontrado = null;
        if (resultado != null) {
            funcionarioEncontrado = resultado.getConteudo();
            System.out.println("Funcionário encontrado: Nome - " + funcionarioEncontrado.getNome() + ", CPF - "
                    + funcionarioEncontrado.getCpf() + ", Função - " + funcionarioEncontrado.getFuncao());
        } else {
            System.out.println("Funcionário não encontrado.");
        }
        return funcionarioEncontrado;
    }
}
