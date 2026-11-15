package URI_1010;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int cod1 = scanner.nextInt();
        int quant1 = scanner.nextInt();
        double precoU1 = scanner.nextDouble();

        int cod2 = scanner.nextInt();
        int quant2 = scanner.nextInt();
        double precoU2 = scanner.nextDouble();

        double tot = (quant1 * precoU1) + (quant2 * precoU2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", tot);

        scanner.close();
    }
}
