import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta >>");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da agencia >>");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente >>");
        String nomeCliente = scanner.next();

        System.out.println("Digite o sobrenome do cliente >>");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite o saldo disponivel >>");
        double saldo = scanner.nextDouble();

        String message = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.", nomeCliente + ' ' + sobrenomeCliente, agencia, numero, saldo);

        System.out.println(message);
    }
}