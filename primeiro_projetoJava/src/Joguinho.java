import java.util.Random;
import java.util.Scanner;

public class Joguinho {
    public static void main(String[] args) {

        int numeroAleatorio = 0;
        Scanner leitura = new Scanner (System.in);
        numeroAleatorio = new Random().nextInt(100);
        // System.out.println(numeroAleatorio);

        for (int i = 0; i < 5; i++) {
            System.out.println("Chute um numero de 1 a 100");
            int numeroChutado = leitura.nextInt();

           if(i == 4){
                System.out.println("Suas vidas acabaram você predeu, o numero era: " + numeroAleatorio);
                break;
            } if (numeroChutado == numeroAleatorio) {
                System.out.println("Parabens vc acertou");
                break;
            }if (numeroChutado > numeroAleatorio){
                System.out.println("O numero que vc colocou é maior que o numero aleatorio");
                   System.out.println("vc tem mais "+ (i - 5) + " vidas sobrando");
            }if (numeroChutado < numeroAleatorio){
                System.out.println("O numero que vc colocou é menor que o numero aleatorio");
                System.out.println("vc tem mais "+ (4-i) + " vidas sobrando");
        
            }
        }
    }
}