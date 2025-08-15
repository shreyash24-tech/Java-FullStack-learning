import java.util.*;

public class GradeCalculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int marks;

        System.out.println("Enter your Marks=");
        marks=sc.nextInt();

        if(marks>85 && marks <=100)

        {
            System.out.println("A GRADE");

        }

        else if(marks>65)
        {
            System.out.println("B GRADE");

        }

        else if(marks>35)
        {
            System.out.println("C GRADE");
        }

        else
        {
            System.out.println("FAILED");

        }

    }
    
}
