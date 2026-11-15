package URI_1011;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double PI = 3.14159;
        double raio = scanner.nextDouble();

        double form = (4.0/3) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", form);

        scanner.close();
    }
}
