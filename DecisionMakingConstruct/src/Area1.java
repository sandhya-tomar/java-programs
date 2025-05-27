import java.util.*;

public class Area1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the choice :");
        int a =sc.nextInt();
        switch(a){
            case 1:
                System.out.print("Enter radius of circle: ");
                double radius = sc.nextDouble();
                double areaCircle = Math.PI * radius * radius;
                System.out.println("Area of Circle: " + areaCircle);
                break;
            case 2:
                System.out.print("Enter length of rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter width of rectangle: ");
                double width = sc.nextDouble();
                double areaRectangle = length * width;
                System.out.println("Area of Rectangle: " + areaRectangle);
                break;
            case 3:
                System.out.print("Enter base of triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = sc.nextDouble();
                double areaTriangle = 0.5 * base * height;
                System.out.println("Area of Triangle: " + areaTriangle);
                break;
            case 4:
                System.out.print("Enter side of square: ");
                double side = sc.nextDouble();
                double areaSquare = side * side;
                System.out.println("Area of Square: " + areaSquare);
                break;
            default:
                System.out.println("Invalid choice. Please enter a number from 1 to 4.");
        }
    }
}
