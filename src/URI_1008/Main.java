package URI_1008;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int h = scanner.nextInt();
        double s = scanner.nextDouble();

        double x = h * s;
        System.out.printf("NUMBER = %d\n", n);
        System.out.printf("SALARY = U$ %.2f\n", x);
        scanner.close();
    }
}
