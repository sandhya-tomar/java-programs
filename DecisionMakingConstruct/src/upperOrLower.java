import java.util.*;

public class upperOrLower {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character :");
        char a=sc.nextLine().charAt(0);
        if(a>='a' && a<='z')
            System.out.print("It is in lowercase.");
        else if(a>='A' && a<='Z')
            System.out.print("It is in uppercase.");
        else{
            System.out.print("Invalid input.");
        }
    }
}
