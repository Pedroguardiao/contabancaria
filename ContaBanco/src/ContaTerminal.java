import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        int num = scanner.nextInt();

        System.out.println(" Usuário: " + num );

        System.out.println("Nome do Cliente: !");
        String nome = scanner.next();

        System.out.println("digite sua agencia: !");
        String agencia = scanner.next();

        System.out.println("digite sue saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + num + " e seu saldo é R$ " + saldo + " já está disponível para saque");









    }
}
