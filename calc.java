import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Operations operations = new Operations();

    System.out.println("CALCULATOR 🧑‍💻");

    System.out.print("Enter number: ");
    double num1 = sc.nextDouble();

    System.out.print("Enter the operator: ");
    char operation = sc.next().charAt(0);

    while (operation != '=') {
      System.out.print("Enter number: ");
      double num2 = sc.nextDouble();

      switch (operation) {
        case '+':
          num1 = operations.add(num1, num2);
          break;
        case '-':
          num1 = operations.substract(num1, num2);
          break;
        case '*':
          num1 = operations.multiply(num1, num2);
          break;
        case '/':
          num1 = operations.divide(num1, num2);
          break;
        case '=':
          break;
        default:
          System.out.println("Invalid Input");
      }
      
      System.out.print("Enter the operator: ");
      operation = sc.next().charAt(0);
    }
    System.out.println("Result: " + num1);
  }
}

class Operations {

  public double add(double num1, double num2) {
    return num1 + num2;
  }

  public double substract(double num1, double num2) {
    return num1 - num2;
  }

  public double multiply(double num1, double num2) {
    return num1 * num2;
  }

  public double divide(double num1, double num2) {
    return num1 / num2;
  }
}
