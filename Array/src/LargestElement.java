import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size :");
        int n=sc.nextInt();
        int i;
        int arr[]=new int[n];
        System.out.print("Enter the array elements :");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int b:arr){
            if(b>max)
                max=b;
        }
        System.out.println("Maximum value is: " + max);
    }
}
