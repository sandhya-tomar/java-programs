import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arrsum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            arrsum+=arr[i];
        }

        int total = (n + 1) * (n + 2) / 2;
        int missing_number=total-arrsum;
        System.out.print(missing_number);
    }
}
