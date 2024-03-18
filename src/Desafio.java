import java.util.Scanner;

public class Desafio{
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      double recebeTransferencia = 0;
      double fazTransferencia = 0;
      double saldo = 2500.00;
      int op = 0;

      asterisco(args);
      System.out.print("Dados iniciais do cliente:");
      System.out.println("");
      System.out.println("Nome: Vinicius Quintian");
      System.out.println("Tipo conta: Corrente");
      System.out.println("Saldo inicial: R$ 2500,00");
      asterisco(args);

      System.out.println("""
              
              Operações
                                          
              1- Consultar saldos
              2- Receber valor
              3- Transferir valor
              4- Sair
                          """);

      while (op != 4) {
        System.out.println("");
        System.out.println("digite operção desejada");
        System.out.println("");
        op = input.nextInt();

        switch (op) {
          case 1:
            System.out.println("Seu saldo e: " + saldo);
            break;
          case 2:
            System.out.println("Qual valor deseja receber?");
            recebeTransferencia = input.nextDouble();
            saldo += recebeTransferencia;
            System.out.println("Seu novo saldo é: " + saldo);
            break;
          case 3:
            System.out.println("Qual valor deseja transferir?");
            if(fazTransferencia > saldo) {
              System.out.println("nao há saldo suficiente para fazer essa transferencia");
            } else{
              saldo -= fazTransferencia;
              System.out.println("seu saldo atual é: " + saldo);
            }
            break;
          case 4:
          System.exit(0);
          default:System.out.println("Opção invalida");

        }
      }
    }
  }

  public static void asterisco(String[] args) {
    System.out.println("********************");
  }
}