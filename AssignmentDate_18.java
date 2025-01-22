//1. Write a Java program to take a number (1-7) as input and print the corresponding day of the week: 1 	for Monday, 2 for Tuesday, ..., 7 for Sunday.
//	If the input is not between 1 and 7, display an appropriate error message using if-else.


import java.util.*;

 public class  AssignmentDate_18

{

    public static void main(String x[])

   {

     int day;

     Scanner sc = new Scanner (System.in);
     System.out.print("ENTER NUMBER OF DAY:= ");
     day= sc.nextInt();
     

     if ( day == 1)
        {
           System.out.println("Monday");
        }
     else if ( day == 2)
        {
           System.out.println("Tuesday");
        }
     else if  ( day == 3)
        {
           System.out.println("Wednesday");
        }

    else if  ( day == 4)
        {
           System.out.println("Thursday");
        }

   else if ( day == 5)
        {
           System.out.println("Friday");
        }

   else if  ( day == 6)
        {
           System.out.println("Saturday");
        }
   else if  ( day == 7)

        {
           System.out.println("Sunday");
        }
   else
        {
           System.out.println("Invalid Day");
        }

   }

}
     