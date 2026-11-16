package URI_1042;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min2 = 0, min3 = 0;
        int min1 = Math.min(a, Math.min(b, c));

        if (min1 == a) {
            min2 = Math.min(b, c);
            min3 = Math.max(b, c);
        } else if (min1 == b) {
            min2 = Math.min(a, c);
            min3 = Math.max(a, c);
        } else {
            min2 = Math.min(b, a);
            min3 = Math.max(b, a);
        }

        System.out.print(min1 + "\n");
        System.out.print(min2 + "\n");
        System.out.print(min3 + "\n");
        System.out.print("\n");
        System.out.print(a + "\n");
        System.out.print(b + "\n");
        System.out.print(c + "\n");

        scanner.close();
    }
}
