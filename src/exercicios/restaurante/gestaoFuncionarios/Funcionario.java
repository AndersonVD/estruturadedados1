package exercicios.restaurante.gestaoFuncionarios;

public class Funcionario {
    private String nome;
    private String cpf;
    private String funcao;

    public Funcionario(String nome, String cpf, String funcao) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getFuncao() {
        return this.funcao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Funcionario funcionario = (Funcionario) obj;
        return cpf.equals(funcionario.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }
}
