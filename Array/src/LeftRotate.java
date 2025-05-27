//WAP that swap kth index


import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the kth index number :");
        int t=sc.nextInt();

        int b[]=new int[n];
        int r=0;
        for(int i=t;i<n;i++){
            b[r++]=arr[i];
        }
        for(int i=0;i<t;i++){
            b[r++]=arr[i];
        }
        System.out.print("New Array:");
        for(int m:b){
            System.out.print(m+" ");
        }
    }
}
