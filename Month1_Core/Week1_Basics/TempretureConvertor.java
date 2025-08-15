import java.util.*;
public class TempretureConvertor
{
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        int ch;

        System.out.println("Tempreture Convertor");

        System.out.println("1-Celsius to Fahrenheit");
        System.out.println("2-Fehrenite to Celsius");

        System.out.println("Enter Your Choice=");
        ch=sc.nextInt();
        double temp, con_temp;
        switch(ch)
        {
            case 1:
                System.out.println(" Enter the Tempreture in Celsius=");
                temp=sc.nextDouble();
                con_temp=(temp*9/5)+32;
                System.out.println("Tempreture in Fahrenheit="+con_temp);  
                break;
            
            case 2:
                System.out.println(" Enter the Tempreture in Fahrenheit=");
                temp=sc.nextDouble();
                con_temp=(temp-32)*5/9;
                System.out.println("Tempreture in Celsius="+con_temp);  
                break;


        
        }


    }
    
}
