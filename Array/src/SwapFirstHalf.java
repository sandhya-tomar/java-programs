import java.util.Scanner;

public class SwapFirstHalf {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[i+(n/2)+(n%2)];
            arr[i+(n/2)+(n%2)]=temp;
        }

        System.out.print("New array is:"+"[");
            for(i=0;i<n;i++){
                System.out.print(arr[i]);
                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            }
        }
