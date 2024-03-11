import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numeroGerado = new Random().nextInt(100);
    int tentativas = 0;

    while (tentativas < 10){
      System.out.println("digite um numero entre 0 e 100");
      int numroDigitado = teclado.nextInt();
      tentativas++;

      if (numroDigitado == numeroGerado){
        System.out.println("Parabens, voce acertou o numero");
        break;
      } else if (numroDigitado > numeroGerado){
        System.out.println("numero muito alto");
      } else {
        System.out.println("numero muito baixo");
      }
    }

    if(tentativas == 10){
      System.out.println("Perdeu, o numero era: " + numeroGerado);
    }

    teclado.close();

    }
}