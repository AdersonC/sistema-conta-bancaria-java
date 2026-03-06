package exercicios.desafio5;

public class ContaCorrente extends ContaBancaria {

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo atual da conta é: " + valorDaConta);
    }

    @Override
    public double depositar(double valor) {
        System.out.println("O deposito foi enviado com sucesso!");
        valorDaConta += valor;
        return valorDaConta;
    }

    @Override
    public void verTipoConta() {
        System.out.println("O tipo de sua conta é: " + tipoConta.CONTACORRENTE);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nomeTitular);
        System.out.println("Idade: " + idadeTitular);
        System.out.println("CPF: " + cpf);
    }
}
