package URI_1017;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int v = scanner.nextInt();

        int d = t * v;
        double l = d / 12.0;

        System.out.printf("%.3f\n", l);
        scanner.close();
    }
}
