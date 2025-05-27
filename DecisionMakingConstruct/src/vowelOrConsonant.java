import java.util.*;

public class vowelOrConsonant {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an alphabet :");
        char a=sc.nextLine().charAt(0);
        if(a=='a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I' || a=='o' || a=='O' || a=='u' || a=='U'){
            System.out.print("It is a vowel");
        }
        else if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')){
            System.out.println("It is a consonant.");
        }
        else{
            System.out.print("Invalid input. Please enter an alphabet letter.");
        }

    }
}
