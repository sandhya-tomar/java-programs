//WAP that read a String from user and change String in Uppercase without any predefine method.

import java.util.Scanner;

public class ManualToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder(str);

        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);

            if(ch>='a' && ch<='z'){
                int r=(int)ch;
                r=r-32;
                ch=(char)r;
                result.setCharAt(i,ch);
            }

        }
str= result.toString();

        System.out.println("Uppercase: "+str);
    }
}

