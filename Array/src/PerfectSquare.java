import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter the array elements :");
        int i;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        System.out.print("Perfect square numbers in the array:");
        for(i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                int sqrt = (int)Math.sqrt(arr[i]);
                if (sqrt * sqrt == arr[i]) {
                    System.out.print(arr[i]+" ");
                    count=count+1;
                }
            }
        }
        System.out.println();
        System.out.println("Count : "+count);
    }
}
