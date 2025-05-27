import java.util.Scanner;

public class Ascii {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        while (i <= 126) {
            System.out.println(i + " : " + (char)i);
            i++;
            break;
        }
    }
}
