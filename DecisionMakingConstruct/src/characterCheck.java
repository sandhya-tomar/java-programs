import java.util.*;

public class characterCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character :");
        char a=sc.nextLine().charAt(0);
        if(a>='a' && a<='z' || a>='A' && a<='Z'){
            System.out.print("It is a alphabet.");
        }
        else if(a>='0' && a<='9'){
            System.out.print("It is a number");
        }
        else{
            System.out.print("It is a symbol.");
        }
    }
}
