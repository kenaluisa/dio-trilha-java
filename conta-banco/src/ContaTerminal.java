import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: conhecer e importar a clase scanner
        Scanner scanner = new Scanner(System.in); // classe para ler os dados do usuario
        System.out.println("Por favor, digite o número da agencia: ");
        // obter pela scanner os valores digitados
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        // obter pela scanner os valores digitados
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o nome do cliente: ");
        // obter pela scanner os valores digitados
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        // obter pela scanner os valores digitados
        double saldo = scanner.nextDouble();

        // exibir as mensagens ao usuarios

        // obter pela scanner os valores digitados

        // exibir a mensagem de uma conta criada
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",
                nomeCliente, agencia, numeroConta, saldo);

    }
}
