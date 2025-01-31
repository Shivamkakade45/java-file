//GMT to IST

import java.util.*;

class GmtToIst_31
{
	public static void main(String []x)
	{
		double day, hour, min;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter day");
		day = sc.nextDouble();

		System.out.println("Enter hour");
		hour = sc.nextInt();

		System.out.println("Enter min");
		min = sc.nextInt();

		hour += 5;
		min += 30;

		if((hour < 24 ) && (min < 60 ))
		{
		System.out.println("Day: " +day + "Hour: " +hour + "Min: "+min);
		}
		else if((hour > 24 ) && (min > 60 ))
		{
		day++;
		hour-=24;
		min -= 60;
		System.out.println("Day: " +day + "Hour: " +hour + "Min: "+min);
		}
		else
		{
		System.out.println("Invalid data");
		}
 
	}
}