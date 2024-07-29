import java.util.Scanner;

public class ArmstrongNum{
    public static void main(String[] args){
        int r1, r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        r1 = sc.nextInt();
        r2 = sc.nextInt();
        System.out.println("The Armstrong numbers between " + r1 + " and " + r2 + " are: ");
        int i = 0;
        for (i = r1; i < r2 + 1; i++){
            int c = i;
            String num = Integer.toString(i);
            int size = num.length();
            int armsum = 0;
            while (c != 0){
                armsum += Math.pow(c % 10, size);
                c /= 10;}
            if (armsum == i)
                System.out.println(i);
        }
        }}
