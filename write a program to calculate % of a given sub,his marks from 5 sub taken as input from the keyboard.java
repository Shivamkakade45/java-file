
import java.util.*;
public class topper {
    public static void main(String[] args) {
       
        System.out.println("enter math marks");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
       
        System.out.println("enyer phy marks");
       
        int s2 = sc.nextInt();
       

        System.out.println("enter bio marks");
        int s3 = sc.nextInt();
       

        System.out.println("enter chem marks");
        int s4 = sc.nextInt();
        

        System.out.println("enter sci marks");
        int s5 = sc.nextInt();

        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s3="+s3);
        System.out.println("s4="+s4);
        System.out.println("s5="+s5);

       int sum = s1+s2+s3+s4+s5;
        System.out.println("total marks="+sum*100/500);
        sc.close();
        

    }
}
