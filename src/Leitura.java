import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Digite o título do filme: ");
        String movie = reading.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int year = reading.nextInt();

        System.out.println("Digite a avaliação: ");
        double rating = reading.nextDouble();
    }
}
