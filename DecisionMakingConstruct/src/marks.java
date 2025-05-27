import java.util.Scanner;

public class marks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks :");
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();
        int biology=sc.nextInt();
        int mathematics=sc.nextInt();
        int computer=sc.nextInt();
        double Percentage=(physics + chemistry + biology + mathematics + computer)/5.0;
        if(Percentage >= 90)
            System.out.print("Grade A");
        else if(Percentage >= 80)
            System.out.print("Grade B");
        else if(Percentage >= 70)
            System.out.print("Grade C");
        else if(Percentage >= 60)
            System.out.print("Grade D");
        else if(Percentage >= 40)
            System.out.print("Grade E");
        else
            System.out.print("Grade F");
    }
}
