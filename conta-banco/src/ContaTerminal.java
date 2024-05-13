import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Bem vindo ao Banco Digital");
        System.out.println();

        System.out.println("Por favor, digite o número da sua conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agência: ");
        scanner.nextInt();
        agencia = scanner.nextLine();

        System.out.println("Por favor, insira seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor insira seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +  numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
