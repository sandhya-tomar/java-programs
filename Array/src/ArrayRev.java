import java.util.Scanner;

public class ArrayRev {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i = 0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.print("[");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}
