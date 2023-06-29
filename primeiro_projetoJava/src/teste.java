import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

              Scanner leitura = new Scanner(System.in);

        int perguntasIniciais = 1; 
        Double saldo = 500.00;
        String conta ="";
        String cliente ="";
        int desejo = 0; 

        desejo = leitura.nextInt();

        if (desejo == 3) {
                    System.out.println("Informe o valor a transferir");
                    Double valorTranferido = leitura.nextDouble();
                    if(valorTranferido > saldo){
                        System.out.println("Você nao tem esse valor disponivel");    
                    }else{
                        saldo -= valorTranferido;
                        System.out.println(saldo);
                        System.out.println("Saldo atualizado R$"+ saldo);
                    }
                    
                }
    }
}
