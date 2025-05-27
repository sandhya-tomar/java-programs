import java.util.Scanner;

public class CountNumOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int digit=sc.nextInt();
        int count=0;
        int r;
        while(digit>0){
            r=digit%10;
            digit=digit/10;
            count++;
        }
        System.out.print(count);
    }
}
