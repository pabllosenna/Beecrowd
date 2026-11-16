package URI_1018;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        System.out.print(valor + "\n");

        int notas100 = valor / 100;
        valor %= 100;
        int notas50 = valor / 50;
        valor %= 50;
        int notas20 = valor / 20;
        valor %= 20;
        int notas10 = valor / 10;
        valor %= 10;
        int notas5 = valor / 5;
        valor %= 5;
        int notas2 = valor / 2;
        valor %= 2;
        int moeda1 = valor;

        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00\n", moeda1);

        scanner.close();
    }
}
