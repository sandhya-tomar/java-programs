import java.util.Scanner;

public class ToTitleCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string :");
        String str=sc.nextLine();
        StringBuilder result=new StringBuilder(str);
        int r=(int)result.charAt(0);
        if(r>=97 && r<=122) {
            r = r - 32;
            result.setCharAt(0, (char)r);
        }

        for(int i=1;i<result.length()-1;i++)
        {
            if(result.charAt(i)==' ')
            {
                r=(int)result.charAt(i+1);
                if(r>=97 && r<=122) {
                    r = r - 32;
                    result.setCharAt(i+1, (char) r);
                }
            }
        }
        str=result.toString();
          System.out.println("Titlecase: "+str);

    }
}
