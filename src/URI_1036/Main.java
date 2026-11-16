package URI_1036;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double delta = Math.pow(B, 2) - (4 * A * C);

        double R1 = (-B + Math.sqrt(delta)) / (2 * A);
        double R2 = (-B - Math.sqrt(delta)) / (2 * A);

        if(delta > 0 && A != 0) {
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }else {
            System.out.print("Impossivel calcular\n");
        }

        scanner.close();
    }
}
