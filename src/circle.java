import java.util.*;

public class circle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length: ");
        double l=sc.nextDouble();
        System.out.print("Enter the breadth: ");
        double b=sc.nextDouble();
        double area=l*b;
        double perimeter=2*(l+b);
        System.out.println("The area of a rectangle is :" + area + "\nThe perimeter of a rectangle is :" + perimeter );
    }
}
