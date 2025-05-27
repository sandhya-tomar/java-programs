import java.util.*;

public class swap5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        a=(a+b)-(b=a);
        System.out.print("a :"+ a +"\nb :"+ b);
    }
}
