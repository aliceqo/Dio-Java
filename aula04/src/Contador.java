import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite o número 1:");
        num1 = sc.nextInt();

        System.out.println("Digite o número 2:");
        num2 = sc.nextInt();

        try {
            contar(num1, num2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }

    static void contar(int num1, int num2) {
        if (num2 <= num1) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = num2 - num1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
