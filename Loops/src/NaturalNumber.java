import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=1;
        System.out.println("The natural numbers are :");
        while(i<=a){
            System.out.println(i);
            i++;
        }
    }
}
