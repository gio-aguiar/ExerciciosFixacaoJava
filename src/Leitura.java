import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("De 0 a 10, qual sua nota para o filme?");
        int nota = leitura.nextInt();
        System.out.println("Seu filme favorito é" + filme);
    }
}
