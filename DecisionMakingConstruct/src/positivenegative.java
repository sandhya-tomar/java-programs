import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        if(a>0){
            System.out.print("Is Positive");
        }
        else if(a==0){
            System.out.print("Zero");
        }
        else{
            System.out.print("Is Negative");
        }
    }
}
