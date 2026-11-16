package URI_1044;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean saoMult = (a % b == 0) || (b % a == 0);

        if(saoMult){
            System.out.print("Sao Multiplos\n");
        }else {
            System.out.print("Nao sao Multiplos\n");
        }

        scanner.close();
    }
}
