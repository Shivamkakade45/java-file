import java.util.*;

public class Reverce
{
   public static void main(String x[])
   
   {
       int no,rev = 0, rem;
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter Number");
       no = sc.nextInt();
      
       rem = no%10;
       no = no/10;
       rev = rev + rem*100;

       rem = no%10;
       no = no/10;
       rev = rev + rem*10;

       rem = no%10;
       no = no/10;
       rev = rev + rem*1;
       
       System.out.printf(" Reverce no is:= %d", +rev);

    }

}