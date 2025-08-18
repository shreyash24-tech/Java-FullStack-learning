import java.util.*;
class Shape 
{
    // Area of circle
    double area(double radius)
     {
        return Math.PI * radius * radius;
    }

    double area (double len ,double wid)
    {
        return len *wid;


    } 


    double area(double base,double height ,boolean isTriangle)
    {
        return 0.5 *base * height;

    }

    double area(int side)
    {
        return side *side;
    }
}

public class ShapeArea 
{
    public static void main(String[] args)
 {
       
        Scanner sc=new Scanner(System.in);
        Shape  s= new Shape();
        System.out.println("MENU");
        System.out.println("1 CIRCLE");
        System.out.println("2 RECTANGLE");
        System.out.println("3 TRIANGLE");
        System.out.println("4 SQUARE");

        int ch;
        System.out.println("Enter your choice=");
        ch=sc.nextInt();
        switch(ch)
    {
        case 1:
        System.out.println("Enter the Radius=");
        double radius;
        radius=sc.nextDouble();
        System.out.println("Area of Circle="+ s.area(radius));
        break;

        case 2:
        System.out.println("Enter the Length & Width=");
        double len,wid;
        len=sc.nextDouble();
        wid=sc.nextDouble();
        System.out.println("Area of Rectangle="+ s.area(len,wid));
        break;

        case 3:
        System.out.println("Enter the Base and Height=");
        double b,h;
        b=sc.nextDouble();
        h=sc.nextDouble();
        System.out.println("Area of Circle="+ s.area(b,h,true));
        break;

        case 4:
        System.out.println("Enter the side=");
        int s1;
        s1=sc.nextInt();
        System.out.println("Area of Circle="+ s.area(s1));
        break;

        default:
        System.out.println("ERROR=");
        break;

    }






    }
}