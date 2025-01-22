import java.util.*;

public class SumDigit
{
   public static void main(String x[])
   
   {
       int no,sum = 0,rem;
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter Number");
       no = sc.nextInt();

       rem = no%10;
       no = no/10;
       sum = sum + rem;

       rem = no%10;
       no = no/10;
       sum = sum + rem;
        

       rem = no%10;
       no = no/10;
       sum = sum + rem;
   
       System.out.printf("Sum of Digit is:= %d", +sum);     

     }

}
        