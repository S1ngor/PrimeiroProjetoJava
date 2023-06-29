import java.text.DecimalFormat;
import java.util.Scanner;

public class ProjetoInicial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int perguntasIniciais = 1; 
        Double saldo = 0.00;
        String conta ="";
        String cliente ="";

        
        
        for (int nota= 0; nota != 4;){
            
            DecimalFormat formato = new DecimalFormat("0.00");
            String saldoFormatado = formato.format (saldo);


         String mensagem = """
                ***********************
                Dados iniciais do cliente:
        
                Nome: %s
                Tipo conta: %s
                Saldo disponivel: %s
                ***********************     
                Operações
    
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
    
                Digite a opção desejada: """.formatted(cliente, conta, saldoFormatado);


        if (perguntasIniciais == 1){

            System.out.println("Digite o nome da sua conta");
             cliente = leitura.nextLine();
    
            System.out.println("Qual o modo da sua conta Sr." + cliente);
             conta = leitura.nextLine();
    
            System.out.println("Agora digite o saldo da sua conta");
            saldo = leitura.nextDouble();
    
             formato = new DecimalFormat("0.00");
             saldoFormatado = formato.format (saldo);
    
           
                // System.out.println(mensagem);
                // int desejo = leitura.nextInt();
            
        perguntasIniciais = 1+1;

        }else {
            System.out.println(mensagem);
           int desejo = leitura.nextInt(); 

            if (desejo != 1 && desejo!=2&& desejo!=3&&desejo!=4) {
                System.out.println("Ação invalida, tenha certeza que colocou o numero certo");   
                System.out.println("Coloque um numero para sair:");
                desejo = leitura.nextInt();         

            }else {
                if (desejo == 1) {
                    System.out.println("Saldo atual:R$" + saldoFormatado);
                    System.out.println("Coloque um numero para sair");
                    int menu = leitura.nextInt();
                }if (desejo == 2) {
                        System.out.println("Informe o valor a receber");
                        Double valorRecebido = leitura.nextDouble();
                        // saldoFormatado = formato.format (valorRecebido);
                        saldo += valorRecebido;
                        System.out.println(saldo);
                        System.out.println("Saldo atualizado R$"+ saldo);
                        
                    }if (desejo == 3) {
    
                        for (int j = 0;  j == 0;) {
                            System.out.println("Informe o valor a transferir");
                            Double valorTranferido = leitura.nextDouble();
                            if(valorTranferido > saldo){
                                System.out.println("Você nao tem esse valor disponivel");    
                                System.out.println("Caso deseja sair aperte um numero maior que zero");
                                j = leitura.nextInt();
                            }else{
                                saldo -= valorTranferido;
                                System.out.println(saldo);
                                System.out.println("Saldo atualizado R$"+ saldo);
                                j = 3;
                            }
                            
                        }
                        
                    }if (desejo == 4 ) {
                        System.out.println("Sessão finalizada");
                        break;
                    }

            }
                }
        }
        }
    }   


