package URI_1013;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int AB = ((a + b) + Math.abs(a - b)) / 2;
        int maior = ((AB + c) + Math.abs(AB - c)) / 2;

        System.out.printf("%d eh o maior\n", maior);


        scanner.close();
    }
}
