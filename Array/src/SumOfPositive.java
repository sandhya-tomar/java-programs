import java.util.*;

public class SumOfPositive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array elements :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(i=0;i<n;i++){
            if(arr[i]>=0){
                sum+=arr[i];
            }
        }
        System.out.print(sum);
    }
}
