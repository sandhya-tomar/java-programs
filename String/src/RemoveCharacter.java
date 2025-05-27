//WAP that read A String from user and delete all occurrence of given character .

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the String :");
        String str=sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);

        String s=Character.toString(ch);
        String ans = str.replace(s, "");
        System.out.println(ans);
    }
}
