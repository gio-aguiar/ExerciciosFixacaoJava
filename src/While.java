import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int vezes = 0;

        while (nota != -1) {
            System.out.println("Digite a sua avaliação para o filme, ou -1 para encerrar");
            nota = leitura.nextDouble();


            if (nota != -1)
            {
                mediaAvaliacao += nota;
                vezes++;
            }

            if (vezes <= 1)
            {
                System.out.println("Comece novamente. É necessário no mínimo 2 notas para calcular a média.");
            }
        }

        System.out.println("A média de avaliações do filme é:" + (int) mediaAvaliacao/vezes);
    }
}
