public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamentop = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano="Normal";

        if (anoDeLancamentop >= 2022) {
            System.out.println("Lançamentos que os clientes estao curtindo !");
        }else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus") ) {
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }
    }

}
