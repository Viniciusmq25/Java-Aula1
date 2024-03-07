public class App {
    public static void main(String args[]) {
        int ano = 2022;
        boolean incluidoNoPlano = true;
        double media = (9 + 9 + 10 + 10) / 4;
        String sinopse;
        sinopse = """

          Deadpool is a 2018 American superhero film 
        based on the Marvel Comics character of the same name.
        it has the scored 9.8 on the IMDB.
         """;
         double classificacao;
         classificacao = (double) (media /2);

        System.out.println("Bem vindo ao Screen Match!");
        System.out.println("Filme: Deadpool");
        System.out.println(ano);
        System.out.println("nota dividida por 2: " + classificacao);
        System.out.println(incluidoNoPlano);
        System.out.println(sinopse);

    }
}