import java.util.Scanner;

public class SwapAdjacentElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i += 2){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        System.out.print("New array will be: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
//            if (i < n - 1) {
//                System.out.print(", ");
//            }
        }
        System.out.println("]");
    }
}
