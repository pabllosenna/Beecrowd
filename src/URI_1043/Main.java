package URI_1043;

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
        double perimetro, area;

        if(A + B > C && A + C > B && B + C > A){
            perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }else {
            area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", area);
        }


        scanner.close();
    }
}
