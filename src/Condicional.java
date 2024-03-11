public class Condicional {
  public static void main(String[] args) {
    int anoDeLancamento = 2022;
    boolean incluidoNoPlano = true;
    String tipoPlano = "basic";

    if(anoDeLancamento >= 2022){
      System.out.println("Launch that clients are enjoying!");
    } else {
      System.out.println("Filme muito antigo!");
    }

    if(incluidoNoPlano == true && tipoPlano.equals("plus") ) {
      System.out.println("Ok, pode assistir");
    }else{
      System.out.println("Pague o plus para assistir a este filme.");
    }

    System.out.println("Seu plano atualmente é: " + tipoPlano);
  }
}
