import java.text.DecimalFormat;
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner loop = new Scanner(System.in);
        double media = 0;
        double nota = 0 ;
    for (int i = 0; i <  3 ; i++) {
        System.out.println("Diga sua avalição pro filme: ");
        nota = loop.nextDouble();
        media += nota;
    }
    DecimalFormat formato = new DecimalFormat("0.00");
    String mediaFormatada = formato.format(media/3);
    System.out.println("media de avaliação é " + mediaFormatada + "/10");
    }
}