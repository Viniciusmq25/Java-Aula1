import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    double nota, media = 0;

    for (int i = 0; i < 3; i++) {
      System.out.println("Qual a nota do filme?");
      nota = leitura.nextDouble();
      media += nota;
    }

    System.out.println("media de avaliacoes: " + media / 3);  

    leitura.close();

  }
}
