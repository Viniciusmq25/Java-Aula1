import java.util.Scanner;

public class Leitura {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.println("digite seu filme favorito");
    String filme = leitura.nextLine();

    System.out.println("Qual o ano de lançamento?: ");
    int ano = leitura.nextInt();
  
    System.out.println("Qual a nota do filme?: ");
    double nota = leitura.nextDouble();

    System.out.println("seu filme preferito é " + filme + ", de ano " + ano + " e voce avaliou com " + nota);

    leitura.close();
  } 
}
