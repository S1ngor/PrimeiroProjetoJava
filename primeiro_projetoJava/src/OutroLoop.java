import java.text.DecimalFormat;
import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
     Scanner loop = new Scanner(System.in);
        double media = 0;
        double nota = 0 ;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avalição pro filme ou coloque -1 para encerrar ");
            nota = loop.nextDouble();
            if (nota != -1) {
                media += nota;
                totalNotas++;
            }else{
                System.out.println("Finalizado");
            }
        }

        DecimalFormat formato = new DecimalFormat("0.00");
        String mediaFormatada = formato.format(media/totalNotas);
        System.out.println("media de avaliação é " + mediaFormatada + "/10");
    }

}
