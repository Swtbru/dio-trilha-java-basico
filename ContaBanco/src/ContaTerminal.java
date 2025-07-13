import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
          
        var scanner = new Scanner(System.in);

        System.out.println("Por favor, informe seu nome:");
        var name = scanner.next();

        System.out.println("Por favor, informe qual sua agência:");
        var agency = scanner.next();

        System.out.println("Por favor, digite o número da agência:");
        var agencyNumber = scanner.nextInt();

        System.out.println("Por favor, informe o saldo para saque:");
        var balance = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, \n" +
         "conta %s e seu saldo %s já está disponível para saque", name, agency, agencyNumber, balance);

        scanner.close();
    }
}
