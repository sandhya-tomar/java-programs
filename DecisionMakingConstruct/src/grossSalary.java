import java.util.*;

public class grossSalary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter basic salary :");
        double salary=sc.nextDouble();
        double hra,da,gs;
        if(salary<=10000){
            da=salary*0.80;
            hra=salary*0.20;
        }
        else if(salary<=20000){
            da=salary*0.90;
            hra=salary*0.25;
        }
        else{
            da=salary*0.95;
            hra=salary*0.30;
        }
        gs=salary+da+hra;
        System.out.print("Gross salary :"+gs);
    }
}
