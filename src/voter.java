import java.util.*;

public class voter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age:");
        int a = sc.nextInt();
        String result=(a>=18)? "User is a valid voter":"User is not a valid voter";
        System.out.println(result);
    }
}
