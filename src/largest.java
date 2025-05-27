import java.util.*;

public class largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        System.out.print("Enter the third number: ");
        int c=sc.nextInt();
        int result=(a>b && a>c)? a:(b>c)? b:c;
        System.out.print("The bigger number is:"+result);
    }
}
