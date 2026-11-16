package URI_1019;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int h = N / 3600;
        N %= 3600;
        int m = N / 60;
        N %= 60;
        int s = N;

        System.out.printf("%d:%d:%d\n", h, m, s);
        scanner.close();
    }
}
