import java.util.Scanner;

public class PerfectSquare2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int b: arr){
            double sq=Math.sqrt(b);
            double m=Math.floor(sq);
            if(m*m==b){
                count=count+1;
            }
        }
        System.out.print(count);
    }
}
