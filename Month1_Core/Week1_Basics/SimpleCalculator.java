import java.util.*;

public class SimpleCalculator
 {



    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a=0;
        int b=0;
        System.out.println("Enter the 1st number=");
        a=sc.nextInt();
        
        System.out.println("Enter the 2nd number=");
        b=sc.nextInt();


        System.out.println("Addition of given numbers="+(a+b));
        System.out.println("Subtraction of given numbers="+(a-b));
        System.out.println("Multiplication of given numbers="+(a*b));
        System.out.println("Division of given numbers="+(a/b));
    }
    
}
