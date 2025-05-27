import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k;
        for(k=2;k<=n;k++){
            int a=k;
            int p=0;
            int sq=(int) Math.sqrt(a);
            for(int i=2;i<=sq;i++){
                if(a%i==0){
                    p=1;
                    break;
                }
            }
            if(p==0)
                System.out.println("Prime Number :" + a);
        }

    }
}
