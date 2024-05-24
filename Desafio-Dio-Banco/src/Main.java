public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Carlos");
        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaCorrente.depositar(100);
        contaCorrente.imprimirExtrato();

        contaCorrente.transferir(50, contaPoupanca);
        contaPoupanca.imprimirExtrato();

        contaCorrente.imprimirExtrato();
    }
}
