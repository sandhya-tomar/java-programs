import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read number of rotations
        System.out.print("Enter the kth index (number of rotations): ");
        int k = sc.nextInt();

        // Normalize k in case it is greater than n
        k = k % n;

        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[(i + k) % n] = arr[i];  // Right rotation logic
        }

        System.out.print("Array after right rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}

