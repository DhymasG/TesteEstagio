//  a) 1, 3, 5, 7, ___
// Próximo elemento: 9
// A lógica é adicionar 2 ao número anterior.

// b) 2, 4, 8, 16, 32, 64, ____
// Próximo elemento: 128
// A lógica é multiplicar o número anterior por 2.

// c) 0, 1, 4, 9, 16, 25, 36, ____
// Próximo elemento: 49
// A lógica é adicionar o próximo número ímpar perfeito.

// d) 4, 16, 36, 64, ____
// Próximo elemento: 100
// A lógica é adicionar os quadrados dos números pares.

// e) 1, 1, 2, 3, 5, 8, ____
// Próximo elemento: 13
// A lógica é somar os dois números anteriores (sequência de Fibonacci).

// f) 2, 10, 12, 16, 17, 18, 19, ____
// Próximo elemento: 20
// A lógica é adicionar o próximo número inteiro positivo. 

public class Sequencia {
    public static void main(String[] args) {
        // Sequência letra a)
        System.out.println("Proximo elemento da sequencia a): " + proximoElementoA(7));

        // Sequência letra b)
        System.out.println("Proximo elemento da sequencia b): " + proximoElementoB(64));

        // Sequência letra c)
        System.out.println("Proximo elemento da sequencia c): " + proximoElementoC(36));

        // Sequência letra d)
        System.out.println("Proximo elemento da sequencia d): " + proximoElementoD(64));

        // Sequência letra e)
        System.out.println("Proximo elemento da sequencia e): " + proximoElementoE(8));

        // Sequência letra f)
        System.out.println("Proximo elemento da sequencia f): " + proximoElementoF(19));
    }

    // Sequência a)
    public static int proximoElementoA(int ultimo) {
        return ultimo + 2;
    }

    // Sequência b)
    public static int proximoElementoB(int ultimo) {
        return ultimo * 2;
    }

    // Sequência c)
    public static int proximoElementoC(int ultimo) {
        return ultimo + (int) Math.sqrt(ultimo) * 2 + 1;
    }

    // Sequência d)
    public static int proximoElementoD(int ultimo) {
        int raiz = (int) Math.sqrt(ultimo);
        return (raiz + 2) * (raiz + 2);
    }

    // Sequência e)
    public static int proximoElementoE(int ultimo) {
        return 8 + 5;
    }

    // Sequência f)
    public static int proximoElementoF(int ultimo) {
        return ultimo + 1;
    }
}
