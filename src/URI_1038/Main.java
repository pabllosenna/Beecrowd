package URI_1038;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double resultado = 0;
        if(x == 1){
            resultado = y * 4.00;
        }else if(x == 2){
            resultado = y * 4.50;
        }else if(x == 3){
            resultado = y * 5.00;
        }else if(x == 4){
            resultado = y * 2.00;
        }else if(x == 5){
            resultado = y * 1.50;
        }

        System.out.printf("Total: R$ %.2f\n", resultado);

        scanner.close();
    }
}
