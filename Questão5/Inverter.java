import java.util.Scanner;

public class Inverter {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String input = scanner.nextLine();

        String reversed = inverterString(input);

        System.out.println("String invertida: " + reversed);
    }

    public static String inverterString(String input) {
        char[] caracteres = input.toCharArray();

        int esquerda = 0;
        int direita = caracteres.length - 1;

        while (esquerda < direita) {

            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;

            esquerda++;
            direita--;
        }
        String invertida = new String(caracteres);
        return invertida;
    }
}
