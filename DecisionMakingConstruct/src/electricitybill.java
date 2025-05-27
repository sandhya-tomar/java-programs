import java.util.*;

public class electricitybill {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter consumer unit :");
        int a=sc.nextInt();
        float b=0.0f;
        if(a<=50)
            b=a*0.50f;
        else if(a<=150)
            b=(50*0.50f) + (a-50)*0.75f;
        else if(a<=250)
            b=(50*0.50f) + (100*0.75f) + (a-150)*1.20f;
        else
            b=(50*0.50f) + (100*0.75f) + (100*1.20f) + (a-250)*1.50f;
        b=b*1.20f;
        System.out.print("Your bill :"+ b);
    }
}
