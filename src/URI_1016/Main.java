package URI_1016;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        System.out.printf("%d minutos\n", x * 2);

        scanner.close();
    }
}
