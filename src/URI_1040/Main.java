package URI_1040;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();
        float n4 = scanner.nextFloat();

        float mediaFinal, notaExame;

        float media = (float) ((n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10.0);

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            notaExame = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", notaExame);

            mediaFinal = (float) ((media + notaExame) / 2.0);

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", mediaFinal);
        }

        scanner.close();
    }
}