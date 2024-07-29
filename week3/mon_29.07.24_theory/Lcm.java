import java.util.Scanner;

public class Lcm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int lcm = (num1 * num2) / a;
        System.out.println("The lcm of " + num1 + " and " + num2 + " is " + lcm);
    }}

