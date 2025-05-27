import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();){
            char ch=sb.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
                sb.deleteCharAt(i);
            else
                i++;
        }
        s=sb.toString();
        System.out.println(s);
    }
}
