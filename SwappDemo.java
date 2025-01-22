import java.util.*;

public class SwappDemo
{

    public static void main (String x[])

{

      int a = 10;
      int b = 20;
	System.out.println("Before Swapping");	
	System.out.println("A = "+a);
	System.out.println("B = "+b);
      b = a + b;//30
      a = b - a;//20
      b = b - a;//30-20 10
	System.out.println("After Swapping");
   System.out.println("A = "+a);
   System.out.print("B = "+b);

}

}