package exercicios.desafio5;

public class Banco {
    static void main(String[] args) {

        System.out.println("---------------------- CONTA CORRENTE ------------------------------");

        ContaCorrente usuario = new ContaCorrente();
        usuario.nomeTitular = "aderson";
        usuario.idadeTitular = 19;
        usuario.cpf = 12345674;
        usuario.consultarSaldo();
        usuario.depositar(15000);
        usuario.consultarSaldo();
        usuario.verTipoConta();
        usuario.mostrarInformacoes();

        System.out.println("---------------------- CONTA POUPANÇA ------------------------------");

        ContaPoupanca usuario2 = new ContaPoupanca();
        usuario2.nomeTitular = "carlos";
        usuario2.idadeTitular = 30;
        usuario2.cpf = 455235234;
        usuario2.consultarSaldo();
        usuario2.depositar(15000);
        usuario2.consultarSaldo();
        usuario2.verTipoConta();
        usuario2.mostrarInformacoes();
    }
}
