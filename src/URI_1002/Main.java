package URI_1002;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double PI = 3.14159;
        double R = scanner.nextDouble();
        double a = PI * Math.pow(R, 2);

        System.out.printf("A=%.4f\n", a);

        scanner.close();
    }
}
