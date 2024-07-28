import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        double num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        num1 = sc.nextDouble();

        int choice = 1;

        while (choice == 1) {
            System.out.println("Enter number");
            num2 = sc.nextDouble();

            System.out.println("Choose an operator: +, -, *, /, %");
            operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    num1 += num2;
                    System.out.println(num1);
                    break;
                case '-':
                    num1 -= num2;
                    System.out.println(num1);
                    break;
                case '*':
                    num1 *= num2;
                    System.out.println(num1);
                    break;
                case '/':
                    num1 /= num2;
                    System.out.println(num1);
                    break;
                case '%':
                    num1 %= num2;
                    System.out.println(num1);
                    break;
            }

            System.out.println("Enter 1 to continue\n2. quit");
            choice = sc.nextInt();
        }
    }
}
