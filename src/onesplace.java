import java.util.Scanner;

public class onesplace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a=sc.nextInt();
        System.out.print("Enter the second number :");
        int b=sc.nextInt();
        int d1=a%10;
        int d2=b%10;
        int result=(d1<d2)? a:b;
        System.out.print("The number with smaller ones place digit number is:"+ result);
    }
}
