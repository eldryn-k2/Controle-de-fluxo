 import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.next();
        
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o saldo da conta:");
        double saldoConta = scanner.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s e o número da sua conta é %d. Seu saldo é de R$ %.2f%n", 
                          nomeCliente, numeroAgencia, numeroConta, saldoConta);
        
        scanner.close();
    }
}
