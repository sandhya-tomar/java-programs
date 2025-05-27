import java.util.*;

public class alphaOrnot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character :");
        char a=sc.nextLine().charAt(0);
        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
            System.out.println(a + " is an alphabet.");
        } else {
            System.out.println(a + " is not an alphabet.");
        }
    }
}
