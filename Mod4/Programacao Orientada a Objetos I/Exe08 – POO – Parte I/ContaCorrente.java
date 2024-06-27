package ContaCorrente;

import java.util.Scanner;

public class ContaCorrente {
    private String banco;
    private int agencia;
    private int contacorrente;
    private String cpf;
    private float saldo;
    private boolean status;
    private Cliente cliente;

    Scanner teclado = new Scanner(System.in);

    public ContaCorrente(String banco, int agencia, int contacorrente, String cpf, float saldo, boolean status,
            Cliente cliente) {
        this.banco = banco;
        this.agencia = agencia;
        this.contacorrente = contacorrente;
        this.cpf = cpf;
        this.saldo = saldo;
        this.status = status;
        this.cliente = cliente;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getContacorrente() {
        return contacorrente;
    }

    public void setContacorrente(int contacorrente) {
        this.contacorrente = contacorrente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void visualizaConta() {
        if (cliente.validaSenha()) {
            System.out.println("Banco: " + this.getBanco());
            System.out.println("Agencia: " + this.getAgencia());
            System.out.println("Conta Corrente: " + this.getContacorrente());
            System.out.println("CPF: " + this.getCpf());
            System.out.println("Saldo R$: " + this.getSaldo());
        } else {
            System.out.println("Não foi possível visualizar conta corrente.");
        }
    }

    public void abrirConta() {
        if (cliente.validaSenha()) {
            if (this.isStatus()) {
                System.out.println("Esta conta já está aberta.");
            } else {
                this.setStatus(true);
                System.out.println("Conta aberta com sucesso.");
            }
        } else {
            System.out.println("Operação de abrir conta não pode ser realizada.");
        }
    }

    public void fecharConta() {
        if (cliente.validaSenha()) {
            if (this.isStatus()) {
                if (this.getSaldo() == 0) {
                    this.setStatus(false);
                    System.out.println("Conta fechada com sucesso.");
                } else {
                    System.out.println("A conta não pode ser fechada pois possui saldo, ou seja, saldo diferente de 0.");
                }
            } else {
                System.out.println("Conta já está fechada.");
            }
        } else {
            System.out.println("Conta já está fechada.");
        }
    }

    public void alteraConta() {
        if (cliente.validaSenha()) {
            System.out.println("Digite o Banco");
            setBanco(teclado.nextLine());
            System.out.println("Digite a agencia");
            setAgencia(teclado.nextInt());
            System.out.println("Digite a conta corrente");
            setContacorrente(teclado.nextInt());
            System.out.println("Digite o CPF");
            setCpf(teclado.nextLine());
            System.out.println("Alterações realizadas com sucesso");
        } else {
            System.out.println("A conta não pode ser alterada.");
        }
    }

    public void debitaSaldo() {
        if (cliente.validaSenha() && this.isStatus()) {
            System.out.println("Digite o valor do debito (R$): ");
            float debito = teclado.nextFloat();
            if (debito <= this.getSaldo()) {
                setSaldo(this.getSaldo() - debito);
                System.out.println("Débito realizado com sucesso. Novo saldo = " + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente para o débito. Saldo atual = " + this.getSaldo());
            }
        } else {
            System.out.println("Operação de débito não realizada.");
        }
    }

    public void creditaSaldo() {
        if (cliente.validaSenha() && this.isStatus()) {
            System.out.println("Digite o valor do crédito (R$): ");
            float credito = teclado.nextFloat();
            setSaldo(this.getSaldo() + credito);
            System.out.println("Crédito realizado com sucesso. Novo saldo = " + this.getSaldo());
        } else {
            System.out.println("Operação de crédito não realizada.");
        }
    }
}
