import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        System.out.print("Enter the array elements :");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int Even_count=0;
        int Odd_count=0;
        for(i=0;i<n;i++){
            if(arr[i]%2==0)
                Even_count+=1;
            else
                Odd_count+=1;
        }
        System.out.println("Even Counts :"+ Even_count);
        System.out.print("Odd Counts :"+ Odd_count );
    }
}
