import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero para verificar se pertence a sequencia de Fibonacci: ");
        int numero = scanner.nextInt();

        boolean pertence = verificaSePertence(numero);

        if (pertence) {
            System.out.println(numero + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println(numero + " nao pertence a sequencia de Fibonacci.");
        }
    }

    public static boolean verificaSePertence(int numero) {
        int a = 0;
        int b = 1;

        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return false;
    }
}
