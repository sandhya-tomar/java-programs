import java.util.Scanner;

public class Lcm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int max = (n1 > n2) ? n1 : n2;//smaller number

        while (true) {
            if (max % n1 == 0 && max % n2 == 0) {
                System.out.println("LCM of " + n1 + " and " + n2 + " is: " + max);
                break;
            }
            max++;
        }
    }
}

