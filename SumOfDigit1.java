//Example: WAP to input three digit numbers and calculate its sum?

import java.util.*;

public class SumOfDigit1
{
   public static void main(String x[])
   
   {
       int no,sum ;
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter Number");
       no = sc.nextInt();

       sum = (no%10) + ((no/10)%10)  +  no/100;  // in this line every position (no is same as 123)

       System.out.printf("Sum of digit := %d", +sum);

    }

}