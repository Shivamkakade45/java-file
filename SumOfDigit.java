import java.util.*;
 

public class SumOfDigit

     {
          public static void main(String x[])
        {
            Scanner sc = new Scanner (System.in);

            System.out.println("Enter a input:= ");
            int sum = 0, num, no;
            no = sc.nextInt();
            
             
            num = no%10;
            sum = sum + num;
            no = no/10;
            
            num = no%10;
            sum = sum + num;
            no = no/10;
            
            num = no%10;
            sum = sum + num;
            no = no/10;
            
            System.out.printf("Sum of digit is given := %d", +sum);

        }

}