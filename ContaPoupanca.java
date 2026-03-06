package exercicios.desafio5;

public class ContaPoupanca extends ContaBancaria {

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo atual da conta é: " + valorDaConta);
    }

    @Override
    public double depositar(double valor) {
        valorDaConta += valor;
        valorDaConta = valorDaConta - (valorDaConta / 100);
        return valorDaConta;
    }

    @Override
    public void verTipoConta() {
        System.out.println("O tipo de sua conta é: " + tipoConta.CONTAPOUPANCA);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nomeTitular);
        System.out.println("Idade: " + idadeTitular);
        System.out.println("CPF: " + cpf);
    }
}
