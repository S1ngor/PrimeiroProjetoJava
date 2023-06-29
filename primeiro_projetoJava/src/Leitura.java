import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("seu filme favorito é: " + filme);
        System.out.println("Qual é a data de lançamento ?");
        int dataDeLancamento = leitura.nextInt();
        System.out.println("O ano de lançamento é: "+ dataDeLancamento);
        System.out.println("Diga sua avalição pro filme: ");
        double avalição = leitura.nextDouble();
        System.out.println("Sua avaliaçao foi de: " + (double) avalição);
    }
}
