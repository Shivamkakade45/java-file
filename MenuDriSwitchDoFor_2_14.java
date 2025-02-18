/*
Q2. Write a menu driven program in java using switch case & do while loop.

	1.  Display The 1 To nth Prime Number :
	2. Display The 1 To nth Perfect Number :
	3. Display The 1 To nth Duck Number :
	4. Display The 1 To nth Strong Number :
	5. Display The 1 To nth Armstrong Number :

*/
import java.util.*;

public class MenuDriSwitchDoFor_2_14
{
	public static void main(String x[])
	{
		int y,sum=0;
		do
		{
			
			Scanner sc = new Scanner (System.in);
			System.out.println("1.Prime Number\n 2.Perfect Number\n 3.Duck Number\n 4.Strong Number\n 5.Armstrong Number");
			System.out.println("Enter a choice");
			int choice = sc.nextInt();
			switch(choice)
			{
			
				case 1:
					System.out.println("Enter a numbert= ");
					int n = sc.nextInt();
					for(int i=2;i<=n;i++)
					{
						int count=0;
						for(int j=1;j<=i;j++)
						{
							if(i%j==0)
							{
								count++;
							}
						}
						if(count==2)
						{
							System.out.println("Prime Number is:= "+i);
						}
						
					}
					break;
				case 2:
					System.out.println("enter a number: ");
					n = sc.nextInt();
					for(int i=1;i<=n;i++)
					{
						sum = 0;
						for(int j=1;j<=i/2;j++)
						{
							if(i%j==0)
							{
								sum = sum + j;
							}
						}
						if(sum == i)
						{
							System.out.println("perfect number is:= "+i);
						}
					}	
					break;
				case 3:
					System.out.println("enter a number: ");
					n = sc.nextInt();
					for(int i=1;i<=n;i++)
					{
						int flag = 0;
						for(int j=i;j>0;j/=10)
						{
							if(j%10==0)
							{
								flag = 1;
								break;
							}
						}
						if(flag == 1)
						{
							System.out.println("Duck number is:= "+i);
						}
					}
					break;
				case 4:
					System.out.println("enter a number: ");
					n = sc.nextInt();
					for(int i=1;i<=n;i++)
					{
						sum = 0;
						int num1=i;
						while(num1>0)
						{
							int rem = num1%10;
							int fact = 1;
							for(int j=1;j<=rem;j++)
							{
								fact = fact*j;
							}
							
							sum = sum + fact;
							num1 /=10;
						}
						if(sum == i)
						{
							System.out.println("Strong number is:= "+sum);	
						}
					}
					break;
				case 5:
					System.out.println("enter a number: ");
					n = sc.nextInt();//153
					for(int i=1;i<=n;i++)
					{
						int y1=i;
						int num2=i;
						int count = 0;
						for(int j=i;j>0;j/=10)
						{
							count++;//3
						}

						//System.out.println("Number of digit is:= "+count);
						sum = 0;
						while(num2>0)//1>0
						{
							int rem = num2%10;//1
							int pow = 1;
							
							for(int k=1;k<=count;k++)
							{
								pow = pow * rem;//1
							}
				
							sum = sum + pow;//27+125=152+1
							num2 /= 10;//1  0
							
						}
						if(sum == y1)
						{
							
							System.out.println("Armstrong number is:= "+sum);//1 2
						}
	
					}
					break;

					default:
							System.out.println("Invalid data");
			}
			System.out.println("Do you want to continue yes (y==1) No (y=0) ");
			y = sc.nextInt();
		}while(y==1);

	}

}
