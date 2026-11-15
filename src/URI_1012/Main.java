package URI_1012;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double PI = 3.14159;

        double areaTri = (a * c) / 2.0;
        double areaCir = PI * Math.pow(c, 2);
        double areaTra = (a + b) * c / 2;
        double areaQua = Math.pow(b, 2);
        double areaRet = a * b;

        System.out.printf("TRIANGULO: %.3f\n", areaTri);
        System.out.printf("CIRCULO: %.3f\n", areaCir);
        System.out.printf("TRAPEZIO: %.3f\n", areaTra);
        System.out.printf("QUADRADO: %.3f\n", areaQua);
        System.out.printf("RETANGULO: %.3f\n", areaRet);


        scanner.close();
    }
}
