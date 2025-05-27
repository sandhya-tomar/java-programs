import java.util.Scanner;

public class rectangleOrSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length :");
        int length=sc.nextInt();
        System.out.print("Enter the breadth :");
        int breadth=sc.nextInt();
        String result=(length==breadth)? "It is a square." : "It is a rectangle.";
        System.out.print(result);
    }
}
