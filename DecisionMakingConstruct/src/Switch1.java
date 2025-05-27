import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a=sc.nextInt();
        System.out.print("Enter second number :");
        int b=sc.nextInt();
        System.out.print("Enter the operator :");
        int c=sc.nextInt();
        switch(c){
            case 1:
                System.out.print("Addition :" + (a+b));
                break;
            case 2:
                System.out.print("Subtract :" + (a-b));
                break;
            case 3:
                System.out.print("Multiply :" + (a*b));
                break;
            case 4:
                System.out.print("Divide :" + (a/b));
                break;
            default :
                System.out.print("Wrong choice");
        }
    }
}
