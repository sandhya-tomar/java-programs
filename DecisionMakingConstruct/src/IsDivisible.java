import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a=sc.nextInt();
        if(a%5==0 & a%11==0)
            System.out.print("Number is divisible by 5 and 11");
        else
            System.out.print("Number is not divisible by 5 and 11");
    }
}
