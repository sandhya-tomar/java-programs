import java.util.Scanner;

public class big {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();
        int result=(a>b)? a:b;
        System.out.print("The bigger number is:"+result);
    }
}
