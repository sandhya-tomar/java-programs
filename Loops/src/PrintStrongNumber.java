import java.util.Scanner;

public class PrintStrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input upper limit

        for (int num = 1; num <= n; num++) {
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                int fact = 1;

                // Calculate factorial of the digit
                for (int i = 1; i <= digit; i++) {
                    fact *= i;
                }

                sum += fact;
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}

