package URI_1045;

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

        double temp = 0;

        if(a < b){
            temp = a;
            a = b;
            b = temp;
            temp = 0;
        }

        if(a < c){
            temp = a;
            a = c;
            c = temp;
            temp = 0;
        }

        boolean naoFormaTriangulo = a >= b + c;
        double v = Math.pow(b, 2) + Math.pow(c, 2);
        boolean trianguloRetangulo = Math.pow(a , 2) == v;
        boolean trianguloObtusangulo = Math.pow(a , 2) > v;
        boolean trianguloAcutangulo = Math.pow(a , 2) < v;
        boolean trianguloEquilatero = a == b && b == c;
        boolean trianguloIsosceles = (a == b && b != c) || (a == c && c != b) || (b == c && c != a);

        if(naoFormaTriangulo){
            System.out.print("NAO FORMA TRIANGULO\n");
        }else {
            if(trianguloRetangulo){
                System.out.print("TRIANGULO RETANGULO\n");
            }else if(trianguloObtusangulo){
                System.out.print("TRIANGULO OBTUSANGULO\n");
            }else if(trianguloAcutangulo){
                System.out.print("TRIANGULO ACUTANGULO\n");
            }

            if(trianguloEquilatero){
                System.out.print("TRIANGULO EQUILATERO\n");
            }else if(trianguloIsosceles){
                System.out.print("TRIANGULO ISOSCELES\n");
            }
        }

        scanner.close();
    }
}
