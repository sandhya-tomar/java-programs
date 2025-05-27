import java.util.*;

public class lastdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        int b=a%10;
        System.out.print("The last digit of the number is:"+b);
    }
}
