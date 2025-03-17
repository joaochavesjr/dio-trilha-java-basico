import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int num_conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agencia:");
        String num_agencia = scanner.nextLine();

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+num_agencia+", conta "+num_conta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}