package URI_1046;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int horaInicio = scanner.nextInt();
        int horaFim = scanner.nextInt();

        int duracao = horaFim > horaInicio ? horaFim - horaInicio
                : horaFim == horaInicio ? 24
                : (24 - horaInicio) + horaFim;


        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);


        scanner.close();
    }
}
