import java.util.*;

public class NumberGuessGame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        Random rand=new Random();
        int random_number,guess=0;
        random_number=rand.nextInt(100)+1;

        System.out.println("Random Number is choosen");




    while(guess!=random_number)
    {

        System.out.println("Enter your Guess=");

        guess=sc.nextInt();
        
        if(guess<random_number)
        {
            System.out.println("Your Guess is too Lower");

        }

        else if(guess>random_number)
        {
            System.out.println("Your guess is too Higher");
        }

        else
        {
            System.out.println("ERROR");

        }
    }
    System.out.println("RIGHT GUESS");


    }
    
}
