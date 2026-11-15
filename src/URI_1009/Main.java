package URI_1009;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        double sf = scanner.nextDouble();
        double tv = scanner.nextDouble();

        double sfinal = sf + (tv * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", sfinal);
        scanner.close();
    }
}
