import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       int numero;
       String agencia;
       String nomeCliente;
       double saldo;

       System.out.println("Conta em Banco\n");

       System.out.println("Digite seu nome: ");
       nomeCliente = sc.nextLine();

       System.out.println("\nDigite o número da agência: ");
       agencia = sc.nextLine();

       System.out.println("\nDigite o seu saldo: ");
       saldo = sc.nextDouble();

       System.out.println("\nDigite o número da conta: ");
       numero = sc.nextInt();

       System.out.println("\nÓla " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

       sc.close();
    }
}
