import java.util.Scanner;

public class PrintArmstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int k = 1; k <= n; k++) {
            int m = k;
            int t = k;
            int count = 0;
            int s = 0;

            while (m > 0) {
                count++;
                m = m / 10;
            }

            m = k;

            while (m > 0) {
                int r = m % 10;
                m = m / 10;
                s += (int) Math.pow(r, count);
            }

            if (s == t) {
                System.out.println(t + " is an Armstrong Number");
            }
        }
    }
}

