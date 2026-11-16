package URI_1020;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();
        int a = d / 365;
        d %= 365;
        int m = d / 30;
        d %= 30;

        System.out.printf("%d ano(s)\n", a);
        System.out.printf("%d mes(es)\n", m);
        System.out.printf("%d dia(s)\n", d);

        scanner.close();
    }
}
