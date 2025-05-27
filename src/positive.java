import java.util.*;

public class positive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a =sc.nextInt();
        String result = (a > 0) ? "The number is positive." : "The number is negative." ;
        System.out.println(result);
    }
}
