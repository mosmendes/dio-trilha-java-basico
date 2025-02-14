import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldoConta;

        System.out.print("Por favor, digite o número da Conta !");
        numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente !");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo !");
        saldoConta = scanner.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldoConta + " já está disponível para saque");

    }
}
