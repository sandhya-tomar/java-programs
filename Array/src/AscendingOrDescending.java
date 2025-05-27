import java.util.Scanner;

public class AscendingOrDescending {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean m=true;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                m=false;
                break;
            }
        }
        if(m){
            System.out.print("Ascending Order");
        }
        else{
            System.out.print("Not In Ascending Order");
        }
    }
}
