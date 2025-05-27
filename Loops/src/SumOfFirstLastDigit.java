import java.util.Scanner;

public class SumOfFirstLastDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int l=n%10;
        while(n>10){
            n=n/10;
        }
        System.out.println(l+n);
    }
}
