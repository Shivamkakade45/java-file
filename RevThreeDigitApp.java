import java.util.*;

public class RevThreeDigitApp
{

   public static void main(String x[])
   
    {
        Scanner sc = new Scanner (System.in);
        int no;

        System.out.printf("enter a number:= ");
        no = sc.nextInt();

       no = (no%10)*100   +   (no/10)%10*10  +  no/100;

    System.out.printf("Reverce no is:= %d",   +no);

   }

}