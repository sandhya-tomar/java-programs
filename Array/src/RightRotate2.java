import java.util.Scanner;

public class RightRotate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Read number of rotations
        System.out.print("Enter the kth index (number of rotations): ");
        int k = sc.nextInt();

        // Normalize k
        k = k % n;

        // Temporary array for rotated result
        int[] b = new int[n];

        // Copy last k elements to beginning of b
        for (int i = 0; i < k; i++) {
            b[i] = nums[n - k + i];
        }

        // Copy first n-k elements to the rest of b
        for (int i = k; i < n; i++) {
            b[i] = nums[i - k];
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = b[i];
        }

        // Print result
        System.out.print("Array after right rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

