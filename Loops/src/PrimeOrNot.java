import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        boolean isPrime=true;
        while(i<=n/2){
            if(n%i==0){
                isPrime=false;
                break;
            }
           i++;
        }
        if(isPrime){
            System.out.print("Prime number");
        }
        else{
            System.out.print("Not a Prime number");
        }
    }
}
