import java.util.Scanner;

public class SecondLargestElement {
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
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(i=0;i<n;i++){
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.print("Second largest element :"+ secondLargest);
    }
}
