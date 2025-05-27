import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum, i = 1;
        while (i <= 10) {
            sum = n * i;
            System.out.println(n + "*" + i + "=" + sum);
            i++;
        }
    }
}



