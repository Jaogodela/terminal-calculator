import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro:");
    int num1 = scanner.nextInt();

    System.out.print("Digite a operação:");
    String operacao = scanner.nextLine();
    
    System.out.print("Digite outro número inteiro:");
    int num2 = scanner.nextInt();


    
    if(operacao == "+") {
      System.out.print(num1 + num2);
    } else if (operacao == "-") {
      System.out.print(num1 - num2);
    } else if (operacao == "*") {
      System.out.print(num1 * num2);
    } else if (operacao == "/") {
      System.out.print(num1 / num2);
    } else {
      System.out.print("Operação inválida!");
    }

    
  }
  
}