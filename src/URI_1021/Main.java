package URI_1021;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double N = scanner.nextDouble();
        long cents = Math.round(N * 100);

        System.out.print("NOTAS:\n");
        long notas100 = cents / 10000;
        cents %= 10000;
        long notas50 = cents / 5000;
        cents %= 5000;
        long notas20 = cents / 2000;
        cents %= 2000;
        long notas10 = cents / 1000;
        cents %= 1000;
        long notas5 = cents / 500;
        cents %= 500;
        long notas2 = cents / 200;
        cents %= 200;

        System.out.printf("%d nota(s) de R$ 100.00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50.00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20.00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10.00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5.00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2.00\n", notas2);

        System.out.print("MOEDAS:\n");
        long moeda1 = cents / 100;
        cents %= 100;
        long moeda050 = cents / 50;
        cents %= 50;
        long moeda025 = cents / 25;
        cents %= 25;
        long moeda010 = cents / 10;
        cents %= 10;
        long moeda005 = cents / 5;
        cents %= 5;
        long moeda001 = cents;

        System.out.printf("%d moeda(s) de R$ 1.00\n", moeda1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", moeda050);
        System.out.printf("%d moeda(s) de R$ 0.25\n", moeda025);
        System.out.printf("%d moeda(s) de R$ 0.10\n", moeda010);
        System.out.printf("%d moeda(s) de R$ 0.05\n", moeda005);
        System.out.printf("%d moeda(s) de R$ 0.01\n", moeda001);

        scanner.close();
    }
}