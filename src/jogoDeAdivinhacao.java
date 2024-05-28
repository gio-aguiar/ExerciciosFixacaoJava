import java.util.Random;
import java.util.Scanner;

public class jogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int aleatorio = new Random().nextInt(10);
        int tentativas = 0;
        int chute = 0;

        while (tentativas < 5) {
            System.out.println("Digite seu chute!");
            chute = leitura.nextInt();

            tentativas++;

            if (chute == aleatorio) {

                System.out.println("Parabéns! Você acertou com " + tentativas + " tentativas!");
                break;
            }

        }

        if (chute != aleatorio)
        {
            System.out.println("Você não conseguiu :(");
        }

    }
}
