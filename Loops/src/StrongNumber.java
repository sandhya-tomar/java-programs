import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input number
        int original = n;      // Keep original number
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;   // Extract digit
            int fact = 1;

            // Calculate factorial of digit
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;         // Add factorial to sum
            n /= 10;             // Remove last digit
        }

        // Check if it's a strong number
        if (sum == original)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }
}

