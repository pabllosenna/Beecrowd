package URI_1015;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double pt1 = Math.pow((x2 - x1), 2);
        double pt2 = Math.pow((y2 - y1), 2);
        double dist = Math.sqrt(pt1 + pt2);

        System.out.printf("%.4f\n", dist);

        scanner.close();
    }
}
