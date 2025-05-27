import java.util.Scanner;

public class removelast {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        int b=a/10;
        System.out.print("The number after removing the last digit :"+b);
    }
}
