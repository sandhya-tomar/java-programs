import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers:");
        double p=sc.nextInt();
        double r=sc.nextInt();
        double t=sc.nextInt();
        double si=(p*r*t)/100;
        double amount=p+si;

        System.out.println("Simple Interest: " + si + "\nTotal Amount" + amount);
    }
}
