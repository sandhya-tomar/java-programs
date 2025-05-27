import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int r=n%10;
        while(n>10){
            n=n/10;
        }
        System.out.println("Last digit of the number is :" + r );
        System.out.println("First digit of the number is :" + n );
    }
}
