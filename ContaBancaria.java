package exercicios.desafio5;

public abstract class ContaBancaria implements Conta {

    String nomeTitular;
    int idadeTitular;
    int cpf;
    double valorDaConta;
    TiposConta tipoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(TiposConta tipoConta, double valorDaConta, int cpf, int idadeTitular, String nomeTitular) {
        this.tipoConta = tipoConta;
        this.valorDaConta = valorDaConta;
        this.cpf = cpf;
        this.idadeTitular = idadeTitular;
        this.nomeTitular = nomeTitular;
    }
}
