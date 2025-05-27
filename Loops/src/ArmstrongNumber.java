import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int t=n;
        int count=0;
        int s=0;
        while(n>0){
            count++;
            n=n/10;
        }
        while(m>0){
            int r=m%10;
            m=m/10;
            s=s+(int) Math.pow(r,count);
        }
        if(s==t)
            System.out.print("ArmStrong Number");
        else
            System.out.print("Not a ArmStrong Number");
    }
}
