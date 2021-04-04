import java.util.Scanner; 

public class yeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator: ");
        char operator = sc.next().charAt(0);


        int addition = num1 + num2; // for addition
        int substraction = num1 - num2; // for substraction
        int multiplication = num1 * num2; // for multiplication
        int division = num1 / num2; // for division



        if (operator == '+')/* if operator is '+' we are printing the sum of the numbers entered*/ {
          System.out.println("The sum of the numbers = " + addition);
        }

        else if (operator == '-')/* if operator is '-' we are printing the difference of the numbers entered*/ {
          System.out.println("The difference of the numbers = " + substraction);
        }

        else if (operator == '*')/* if operator is '*' we are printing the product of the numbers entered*/ {
          System.out.println("The multiplication of the numbers = " + multiplication);
        }
        else if (operator == '/')/* if operator is '/' we are doing division and printing the answer*/ {
          System.out.println("The division of the numbers = " + division);
        }

        else
        System.out.println("Invalid Input"); // we are printing "Invalid Input" if the operator is not valid


    }
}
