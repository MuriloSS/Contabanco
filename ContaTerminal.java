import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int numero;
      String agencia, nomecliente;
       double saldo;

      System.out.println("Por favor, digite o número da Conta !");
      numero = scan.nextInt();
      System.out.println("Por favor, digite o número da Agencia !");
      agencia = scan.next();
      System.out.println("Por favor, digite o seu nome completo !");
      nomecliente = scan.next();
      scan.nextLine();
      System.out.println("Por favor, digite o saldo inicial da conta !");
      saldo = scan.nextDouble();
      System.out.println("Olá ["+nomecliente+"], "+"obrigado por criar uma conta em nosso banco, sua agência é ["+ agencia+"], conta ["+ numero+"] e seu saldo ["+ saldo+ "] já está disponível para saque.");
    }
}

