package URI_1035;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if(b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0){
            System.out.print("Valores aceitos\n");
        }else {
            System.out.print("Valores nao aceitos\n");
        }

        scanner.close();
    }
}
