/*
Q1 .Write a menu driven program in java using switch case & do while loop.
      
	1. Check Number Is Prime Number or Not.
	2. Check Number Is Perfect Number or Not..
	3. Check Number Is Duck Number or Not..
	4. Check Number Is Strong Number or Not..
	5. Check Number Is Armstrong Number or Not..

*/

import java.util.*;

public class MenuDriSwitchDoWhile_14
{
	public static void main(String x[])
	{
		int i,n,Y,choice,count=0,sum=0,rem=0,num=0,temp,product,fact;
		do
		{
			Scanner sc = new Scanner (System.in);
			System.out.print("1.Prime Number\n 2.Perfect Number\n 3.Duck Number\n 4.Strong Number\n 5.Armstrong Number");
			System.out.println("Enter a choice");
			choice = sc.nextInt();
			switch(choice)
			{
			
				case 1:
					System.out.println("enter a number:= ");
					n = sc.nextInt();
					 count = 0;
					i=1;
					while(i<=n)
					{
						if(n%i==0)
						{
							count++;
						};
						
						i++;	
					}
				
					if(count==2)
					{
						System.out.println("Prime number");
					}
					else 
					{
						System.out.println("not Prime number");
					}
					break;
				
				case 2:
					System.out.println("enter a number:= ");
					n = sc.nextInt();
					i = 1;
					while(i<=n/2)
					{
						if(n%i==0)
						{
							sum = sum + i;	
						}
						
					i++;
					}
						
						if(sum == n)
						{
							System.out.println("Perfect number");
						}
						else
						{
							System.out.println("Not Perfect number");
						}
					break;
				case 3:
					System.out.println("Enter a Number: ");
					n = sc.nextInt();
					i = 0;
					num = 0;
					while(n!=0)
					{
						rem = n%10;
						if(rem == num)
						{
							break;
						}
						
						n=n/10;
					}
					if(rem == num)
						{
							System.out.println("Duck Number");
						}
						else
						{
							System.out.println("Not Duck Number");
						}
					break;
				case 4:
					System.out.println("enter a number:= ");
					n = sc.nextInt();
					temp = n;
					while(n>0)
					{
						rem = n%10;
						fact = 1;
						i = 1;
						while(i<=rem)
						{
							fact = fact*i;
							i++;
						}
						sum = sum + fact;
						n = n/10;

					}
					n=temp;
					if(sum == n)
					{
						System.out.println("this is strong number");
					}
					else
					{
						System.out.println("this is not strong number");
					}
					break;
				case 5:
					System.out.println("Enter a Number:= ");
					n = sc.nextInt();
					temp = n;
					i = 1;
					while(n>0)
					{
						n = n/10;
						count++;
					}
					System.out.println("Number of digit:= "+count);
					n = temp;
					while(n>0)
					{
						rem = n%10;
						product = 1;
						i = 1;
						while(i<=count)
						{
							product = product * rem;
						i++;
						}
						sum = sum + product;
						n = n/10;	
					}
						n = temp;
					if(sum == n)
					{
						System.out.println("Armstrong number");
					}
					else 
					{
						System.out.println("Not Armstrong number");
					}
					break;
				default :
					System.out.println("Invalid a Data");
			
			}
				
				System.out.println("check again a menu to enter a number 1 or not to enter 0");
				Y = sc.nextInt();
		}while(Y==1);

				System.out.println("Thank You");

	}

}
