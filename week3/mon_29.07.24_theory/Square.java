import java.util.Scanner;
public class Square{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int len = sc.nextInt();
        int i, j;
        for (i = 0; i<len; i++){
            for (j = 0; j<len; j++){
                if (i == 0 || i == len-1 || j == 0 || j == len-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
        System.out.print("\n");}
    }}
