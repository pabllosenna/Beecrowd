package URI_1037;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        if(x <= 100 && x > 75){
            System.out.print("Intervalo (75,100]\n");
        }else if(x <= 75 && x > 50){
            System.out.print("Intervalo (50,75]\n");
        }else if(x <= 50 && x > 25){
            System.out.print("Intervalo (25,50]\n");
        }else if(x <= 25 && x >= 0){
            System.out.print("Intervalo [0,25]\n");
        }else {
            System.out.print("Fora de intervalo\n");
        }

        scanner.close();
    }
}
