public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top gun: Maverick");

        int anoDelancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDelancamento); 
         boolean incluidoNoPlano = true; 
        double notaDoFilme = 8.1;         // para declara os 2 numeors

        int a = 10 + 5; // Atribui o valor 15 à variável a
        int b = 10 - 5; // Atribui o valor 5 à variável b
        int c = 10 * 5; // Atribui o valor 50 à variável c
        int d = 10 / 5; // Atribui o valor 2 à variável d
        int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)

        int aa = 10; // Atribui o valor 10 à variável a
        int bb = 5; // Atribui o valor 5 à variável b
        int cc = 30; // Atribui o valor 30 à variável c

        boolean igual = (bb == aa); //Nesse caso a variável igual ficará com o valor *false*, pois o valor de bb não é igual o valor de aa.
        boolean diferente = (bb != cc); //A variável diferente ficará com o valor *true*, pois o valor de bb é diferente do valor de cc.
        boolean maior = (bb > aa); //A variável maior ficará com o valor *false*, pois o valor de bb é menor que o valor de aa.
        boolean menorIgual = (bb <= cc); //A variável menorIgual ficará com o valor *true*, pois o valor de bb é menor que o valor de cc.


        // São três operadores: AND (&&), OR (||) e NOT (!).

        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

        int num2 = 5;
        int resultado2 = num2++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(num); // imprime 6
        System.out.println(resultado2); // imprime 5


        double media = + (9.8 + 6.3 + 8) / 3;
        System.out.println(media); ; 

        // String ela serve para colocar textos
        String sinopse; 
        sinopse = """
            Filme de aventura 
            com personagem tragico 
            data de lançamento: """ + anoDelancamento;
        System.out.println(sinopse);

         String senha = "12345";
        //  equals() ele serve para analisar se os textos estaos iguais
        // equalsIgnoreCase() ele ignora as letras maisculas e minusculas 
        if (senha.equals("12345")) {
                System.out.println("Acesso autorizado!");
            } else {
                System.out.println("Senha incorreta.");
        }


        String nome = "Miguel";
        int aulas = 4;

        String mensagem = """
                        Olá, %s!
                        Boas vindas ao curso de Java.
                        Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                        """.formatted(nome, aulas);

        System.out.println(mensagem);

        /*% seguido de uma letra que indica o tipo de dado que será inserido no placeholder. Por exemplo, %s indica que uma String será inserida no placeholder, %d indica um valor inteiro e %f indica um valor decimal*/

        int classificação = (int) (media /2);

        System.out.println(classificação);
    }
}
