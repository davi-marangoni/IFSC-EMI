package ContaCorrente;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String identidade;
    private String cpf;
    private String senha;
    private String endereco;
    private String fone;
    private String cidade;
    private String estado;

    Scanner teclado = new Scanner(System.in);

    public Cliente(String nome, String identidade, String cpf, String senha, String endereco, String fone, String cidade, String estado) {
        this.nome = nome;
        this.identidade = identidade;
        this.cpf = cpf;
        this.senha = senha;
        this.endereco = endereco;
        this.fone = fone;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean validaSenha() {
        System.out.println("Valida Usuario/senha");
        System.out.println("Digite Usuario");
        String nom = teclado.nextLine();
        System.out.println("Digite a senha");
        String sen = teclado.nextLine();
        return (nom.equals(this.getNome())) && (sen.equals(this.getSenha()));
    }

    public void visualizaCliente() {
        if (this.validaSenha()) {
            System.out.println("Dados do cliente:");
            System.out.println("Nome: " + this.getNome());
            System.out.println("Identidade: " + this.getIdentidade());
            System.out.println("CPF: " + this.getCpf());
            System.out.println("Senha: " + this.getSenha());
            System.out.println("Endereco: " + this.getEndereco());
            System.out.println("Telefone: " + this.getFone());
            System.out.println("Cidade: " + this.getCidade());
            System.out.println("Estado: " + this.getEstado());
        } else {
            System.out.println("Não foi possivel visualizar o cliente, senha ou usuário inválido!");
        }
    }

    public void alteraCliente() {
        if (this.validaSenha()) {
            System.out.println("Digite o nome:");
            this.setNome(teclado.nextLine());
            System.out.println("Digite a identidade");
            this.setIdentidade(teclado.nextLine());
            System.out.println("Digite o CPF");
            this.setCpf(teclado.nextLine());
            System.out.println("Dados do cliente alterados com sucesso");
        } else {
            System.out.println("Não foi possivel alterar o cliente, senha ou usuário inválido!");
        }
    }

    public void alteraEndereco() {
        if (this.validaSenha()) {
            System.out.println("Digite o endereco");
            this.setEndereco(teclado.nextLine());
            System.out.println("Endereço alterado com sucesso");
        } else {
            System.out.println("Não foi possivel alterar o endereco, senha ou usuário inválido!");
        }
    }

    public void alteraFone() {
        if (this.validaSenha()) {
            System.out.println("Digite o telefone");
            this.setFone(teclado.nextLine());
            System.out.println("Telefone alterado com sucesso");
        } else {
            System.out.println("Não foi possivel alterar o telefone, senha ou usuário inválido!");
        }
    }

    public void alteraCidadeEstado() {
        if (this.validaSenha()) {
            System.out.println("Digite a cidade");
            this.setCidade(teclado.nextLine());
            System.out.println("Digite o estado");
            this.setEstado(teclado.nextLine());
            System.out.println("Cidade e estado alterado com sucesso");
        } else {
            System.out.println("Não foi possivel alterar a cidade e estado, senha ou usuário inválido!");
        }
    }

    public void alteraSenha() {
        if (this.validaSenha()) {
            System.out.println("Digite a nova senha");
            this.setSenha(teclado.nextLine());
            System.out.println("Senha alterada com sucesso");
        } else {
            System.out.println("Não foi possivel alterar a senha, senha ou usuário inválido!");
        }
    }
}
